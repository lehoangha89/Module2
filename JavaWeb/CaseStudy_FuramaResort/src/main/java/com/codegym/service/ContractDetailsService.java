package com.codegym.service;

import com.codegym.model.ContractDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractDetailsService {
    Iterable<ContractDetails> findAll();
    ContractDetails findById(Long id);
    void save(ContractDetails contractDetails);
    void delete(Long id);
}
