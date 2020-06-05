package com.codegym.service.impl;

import com.codegym.model.TypeOfRent;
import com.codegym.repository.TypeOfRentRepository;
import com.codegym.service.TypeOfRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeOfRentServiceImpl implements TypeOfRentService {
    @Autowired
    private TypeOfRentRepository typeOfRentRepository;


    @Override
    public Iterable<TypeOfRent> findAll() {
        return typeOfRentRepository.findAll();
    }

    @Override
    public void save(TypeOfRent typeOfRent) {
        typeOfRentRepository.save(typeOfRent);
    }
}
