package com.codegym.service.impl;

import com.codegym.model.ContractDetails;
import com.codegym.repository.ContractDetailsRepository;
import com.codegym.service.ContractDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailsServiceImpl implements ContractDetailsService {
    @Autowired
    private ContractDetailsRepository contractDetailsRepository;
    @Override
    public Iterable<ContractDetails> findAll() {
        return contractDetailsRepository.findAll();
    }

    @Override
    public ContractDetails findById(Long id) {
        return contractDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ContractDetails contractDetails) {
        contractDetailsRepository.save(contractDetails);
    }

    @Override
    public void delete(Long id) {
        contractDetailsRepository.deleteById(id);
    }
}
