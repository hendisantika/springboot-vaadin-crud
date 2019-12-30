package com.hendisantika.springbootvaadincrud.backend;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-vaadin-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/12/19
 * Time: 13.33
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    /* A version to fetch List instead of Page to avoid extra count query. */
    List<Person> findAllBy(Pageable pageable);

    List<Person> findByNameLikeIgnoreCase(String nameFilter);

    // For lazy loading and filtering
    List<Person> findByNameLikeIgnoreCase(String nameFilter, Pageable pageable);

    long countByNameLikeIgnoreCase(String nameFilter);

}