package com.codegym.service.impl;

import com.codegym.model.Category;
import com.codegym.reposirory.CatagoryRepository;
import com.codegym.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatagoryServiceImpl implements CatagoryService {
    @Autowired
    private CatagoryRepository catagoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return catagoryRepository.findAll(pageable);
    }

    @Override
    public List<Category> findAll2() {
        return catagoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return catagoryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(com.codegym.model.Category catagory) {
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
