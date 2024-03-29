package com.codegym.service.impl;

import com.codegym.model.Dichvu;
import com.codegym.repository.DichvuRepository;
import com.codegym.service.DichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DichvuServiceImpl implements DichvuService {

    @Autowired
    private DichvuRepository dichvuRepository;

    @Override
    public Page<Dichvu> findAll(Pageable pageable) {
        return dichvuRepository.findAll(pageable);
    }

    @Override
    public void save(Dichvu dichvu) {
        dichvuRepository.save(dichvu);
    }

    @Override
    public Dichvu findById(Long id) {
        return dichvuRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        dichvuRepository.deleteById(id);
    }

    @Override
    public Page<Dichvu> findAllByNameServiceContaining(String nameService, Pageable pageable) {
        return dichvuRepository.findAllByNameServiceContaining(nameService,pageable);
    }
}
