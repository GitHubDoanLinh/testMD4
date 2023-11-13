package com.example.test_cg_emp1.service;

import java.util.List;

public interface IGenneralService<E> {
    List<E> findAll();

    E findById(Long id);

    void save(E e);

    void deleteById(Long id);
}
