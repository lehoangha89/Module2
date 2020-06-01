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
    public Page<ContractDetails> findAll(Pageable pageable) {
        return contractDetailsRepository.findAll(pageable);
    }

    @Override
    public void save(ContractDetails contractDetails) {
        contractDetailsRepository.save(contractDetails);
    }
}
