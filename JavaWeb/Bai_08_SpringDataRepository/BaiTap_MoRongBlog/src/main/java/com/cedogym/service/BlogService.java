package com.cedogym.service;


import com.cedogym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog findById(Long id);
    void save(Blog blog);
    void remove(Long id);

Page<Blog> findAllByFirstNameContaining(String name, Pageable pageable);
    Page<Blog> findAllByNameOrderByDayDesc(String name,Pageable pageable);
}
