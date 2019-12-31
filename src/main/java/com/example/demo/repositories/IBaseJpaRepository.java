package com.example.demo.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Transactional
@NoRepositoryBean
public interface IBaseJpaRepository<T> extends PagingAndSortingRepository<T, Long> {

    Iterable<T> findAllActive();

    Iterable<T> findAllActive(Sort sort);

    Page<T> findAllActive(Pageable pageable);

    Iterable<T> findAllActive(Iterable<Long> ids);

    T findOneActive(Long id);

    @Modifying
    void softDelete(Long id);

    @Modifying
    void softDelete(T entity);

    @Modifying
    void softDelete(Iterable<? extends T> entities);

    @Modifying
    void softDeleteAll();

    @Modifying
    void scheduleSoftDelete(Long id, LocalDateTime localDateTime);

    @Modifying
    void scheduleSoftDelete(T entity, LocalDateTime localDateTime);

    long countActive();

    boolean existsActive(Long id);

}

