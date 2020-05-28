package com.cedogym.service;

import com.cedogym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CatagoryService {
    Page<Category> findAll(Pageable pageable);

    Category findById(Long id);

    void save(Category category);

    void remove(Long id);
    Page<Category> findAllByNameContaining(String name,Pageable pageable);

}
