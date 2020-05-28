package com.codegym.service;


import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    List<Blog> findAll2();

    Blog findById(Long id);

    void save(Blog blog);

    void remove(Long id);

    Page<Blog> findAllByFirstNameContaining(String name, Pageable pageable);

    Page<Blog> findAllByNameOrderByDayDesc(String name, Pageable pageable);
}
