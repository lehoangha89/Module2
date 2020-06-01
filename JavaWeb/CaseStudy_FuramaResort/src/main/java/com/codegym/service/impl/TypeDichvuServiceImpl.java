package com.codegym.service.impl;

import com.codegym.model.TypeDichvu;
import com.codegym.repository.TypeDichvuRepository;
import com.codegym.service.TypeDichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeDichvuServiceImpl implements TypeDichvuService {
    @Autowired
    private TypeDichvuRepository typeDichvuRepository;
    @Override
    public Iterable<TypeDichvu> findAll() {
        return typeDichvuRepository.findAll();
    }

    @Override
    public void save(TypeDichvu typeDichvu) {
        typeDichvuRepository.save(typeDichvu);
    }
}
