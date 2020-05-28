package com.codegym.service;

import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CatagoryService {
    Page<Category> findAll(Pageable pageable);
    List<Category> findAll2();
    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
    Page<Category> findAllByNameContaining(String name, Pageable pageable);

}
