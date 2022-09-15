package com.example.jpa_thcustomermanagement.repository;

import java.util.List;

public interface IGeneralRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);
}
