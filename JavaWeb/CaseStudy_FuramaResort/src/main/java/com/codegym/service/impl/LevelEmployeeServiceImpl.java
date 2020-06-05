package com.codegym.service.impl;

import com.codegym.model.LevelEmployee;
import com.codegym.repository.LevelEmployeeRepository;
import com.codegym.service.LevelEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LevelEmployeeServiceImpl implements LevelEmployeeService {
    @Autowired
    private LevelEmployeeRepository levelEmployeeRepository;

    @Override
    public List<LevelEmployee> findAll() {
        return levelEmployeeRepository.findAll();
    }

    @Override
    public void save(LevelEmployee levelEmployee) {
        levelEmployeeRepository.save(levelEmployee);
    }
}
