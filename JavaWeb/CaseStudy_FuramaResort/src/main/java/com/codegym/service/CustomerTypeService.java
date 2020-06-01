package com.codegym.service;

import com.codegym.model.CustomerType;

public interface CustomerTypeService {
    Iterable<CustomerType> findAll();
    void save(CustomerType customerType);
}
