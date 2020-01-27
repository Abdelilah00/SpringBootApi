package com.configuration;

import com.springBootLibrary.entitys.BaseEntity;
import org.hibernate.EmptyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
public class MyInterceptor {

    @Autowired
    private JpaProperties jpaProperties;

    @Bean
    public EmptyInterceptor hibernateInterceptor() {
        return new EmptyInterceptor() {
            @Override
            public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, org.hibernate.type.Type[] types) {
                if (entity instanceof BaseEntity) {
                    ((BaseEntity) entity).setTenantId(TenantContext.getCurrentTenant());
                }
            }

            @Override
            public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, org.hibernate.type.Type[] types) {
                if (entity instanceof BaseEntity) {
                    ((BaseEntity) entity).setTenantId(TenantContext.getCurrentTenant());
                }
                return false;
            }

            @Override
            public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, org.hibernate.type.Type[] types) {
                if (entity instanceof BaseEntity) {
                    ((BaseEntity) entity).setTenantId(TenantContext.getCurrentTenant());
                }
                return false;
            }

        };
    }

/*    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder factory, DataSource dataSource, JpaProperties properties) {
        Map<String, Object> jpaPropertiesMap = new HashMap<>(jpaProperties.getProperties());
        jpaPropertiesMap.put("hibernate.ejb.interceptor", hibernateInterceptor());
        return factory.dataSource(dataSource).packages("com.example").properties(jpaPropertiesMap).build();
    }*/
}

