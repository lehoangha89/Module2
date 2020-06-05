package com.codegym.service;

import com.codegym.model.PartEmployee;

import java.util.List;

public interface PartEmployeeService {
    List<PartEmployee> findAll();
    void save(PartEmployee partEmployee);
}
