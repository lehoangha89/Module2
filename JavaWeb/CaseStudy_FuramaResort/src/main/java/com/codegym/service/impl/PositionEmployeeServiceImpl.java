package com.codegym.service.impl;

import com.codegym.model.PositionEmployee;
import com.codegym.repository.PositionEmployeeRepository;
import com.codegym.service.PositionEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionEmployeeServiceImpl implements PositionEmployeeService {
    @Autowired
    private PositionEmployeeRepository positionEmployeeRepository;
    @Override
    public List<PositionEmployee> findAll() {
        return positionEmployeeRepository.findAll();
    }

    @Override
    public void save(PositionEmployee positionEmployee) {
        positionEmployeeRepository.save(positionEmployee);
    }
}
