package com.codegym.service;

import com.codegym.model.TypeOfRent;

import java.util.Iterator;

public interface TypeOfRentService {
    Iterable<TypeOfRent> findAll();
    void save(TypeOfRent typeOfRent);

}
