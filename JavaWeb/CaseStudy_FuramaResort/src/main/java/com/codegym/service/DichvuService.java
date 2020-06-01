package com.codegym.service;

import com.codegym.model.Dichvu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DichvuService {
    Page<Dichvu> findAll(Pageable pageable);
    void save(Dichvu dichvu);
}
