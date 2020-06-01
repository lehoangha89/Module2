package com.codegym.service;

import com.codegym.model.ContractDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractDetailsService {
    Page<ContractDetails> findAll(Pageable pageable);
    void save(ContractDetails contractDetails);
}
