package com.codegym.service;

import com.codegym.model.PositionEmployee;

import java.util.List;

public interface PositionEmployeeService {
    List<PositionEmployee> findAll();
    void save(PositionEmployee positionEmployee);
}
