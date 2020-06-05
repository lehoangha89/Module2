package com.codegym.service.impl;

import com.codegym.model.PartEmployee;
import com.codegym.repository.PartEmployeeRepository;
import com.codegym.service.PartEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PartEmployeeServiceImpl implements PartEmployeeService {
    @Autowired
    private PartEmployeeRepository partEmployeeRepository;
    @Override
    public List<PartEmployee> findAll() {
        return partEmployeeRepository.findAll();
    }

    @Override
    public void save(PartEmployee partEmployee) {
        partEmployeeRepository.save(partEmployee);
    }
}
