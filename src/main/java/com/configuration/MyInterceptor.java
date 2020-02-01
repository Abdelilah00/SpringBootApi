package com.configuration;

import com.springBootApi.domains.Product;
import com.springBootLibrary.entitys.BaseEntity;
import org.hibernate.EmptyInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    private JpaProperties jpaProperties;

    @Bean
    public EmptyInterceptor hibernateInterceptor() {
        return new EmptyInterceptor() {

            @Override
            public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, org.hibernate.type.Type[] types) {
                if (entity instanceof BaseEntity) {
                    ((BaseEntity) entity).setDeletedBy(TenantContext.getCurrentTenant());
                    logger.info("onDelete ########## => " + entity.toString());
                }
            }

            @Override
            public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, org.hibernate.type.Type[] types) {
                if (entity instanceof BaseEntity) {
                    ((BaseEntity) entity).setUpdatedBy(TenantContext.getCurrentTenant());
                    logger.info("onFlushDirty ########## => " + entity.toString());
                }
                return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types);
            }

            @Override
            public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, org.hibernate.type.Type[] types) {
                if (entity instanceof BaseEntity) {
                    ((Product) entity).setCreatedBy(TenantContext.getCurrentTenant());
                    logger.info("onSave ########## => " + entity.toString());
                }
                return super.onSave(entity, id, state, propertyNames, types);
            }
        };
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder factory, DataSource dataSource, Environment env) {
        Map<String, Object> jpaPropertiesMap = new HashMap<>(jpaProperties.getProperties());
        jpaPropertiesMap.put("hibernate.ejb.interceptor", hibernateInterceptor());

        /*jpaPropertiesMap.put("hibernate.hbm2ddl.auto", env.getProperty("spring.jpa.hibernate.ddl-auto"));
        jpaPropertiesMap.put("hibernate.naming.physical-strategy", env.getProperty("spring.jpa.hibernate.naming.physical-strategy"));*/

        return factory.dataSource(dataSource).packages("com.").properties(jpaPropertiesMap).build();
    }
}
