package com.codegym.service;

import com.codegym.model.LevelEmployee;

import java.util.List;

public interface LevelEmployeeService {
    List<LevelEmployee> findAll();
    void save(LevelEmployee levelEmployee);
}
