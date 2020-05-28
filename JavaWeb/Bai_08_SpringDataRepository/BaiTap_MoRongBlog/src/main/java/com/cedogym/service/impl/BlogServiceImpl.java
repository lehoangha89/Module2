package com.cedogym.service.impl;


import com.cedogym.model.Blog;
import com.cedogym.reposirory.BlogRepository;
import com.cedogym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;


//    @Override
//    public Iterable<Blog> findAll() {
//        return blogRepository.findAll();
//    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(Long id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
       blogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAllByFirstNameContaining(String name, Pageable pageable) {
        return blogRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public Page<Blog> findAllByNameOrderByDayDesc(String name, Pageable pageable) {
        return blogRepository.findAllByNameOrderByDayDesc(name,pageable);
    }


}
