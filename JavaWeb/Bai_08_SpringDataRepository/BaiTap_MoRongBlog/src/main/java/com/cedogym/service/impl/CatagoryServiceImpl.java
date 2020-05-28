package com.cedogym.service.impl;

import com.cedogym.model.Category;
import com.cedogym.reposirory.CatagoryRepository;
import com.cedogym.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CatagoryServiceImpl implements CatagoryService {
    @Autowired
    private CatagoryRepository catagoryRepository;
    @Override
    public Page<Category> findAll(Pageable pageable) {
        return catagoryRepository.findAll(pageable);
    }

    @Override
    public Category findById(Long id) {
        return catagoryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(com.cedogym.model.Category catagory) {
        catagoryRepository.save(catagory);
    }

    @Override
    public void remove(Long id) {
        catagoryRepository.deleteById(id);
    }

    @Override
    public Page<Category> findAllByNameContaining(String name, Pageable pageable) {
        return catagoryRepository.findAllByNameContaining(name,pageable);
    }
}
