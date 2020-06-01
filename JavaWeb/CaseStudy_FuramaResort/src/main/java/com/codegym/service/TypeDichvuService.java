package com.codegym.service;

import com.codegym.model.TypeDichvu;
import org.springframework.data.domain.Page;

public interface TypeDichvuService {
    Iterable<TypeDichvu> findAll();
    void save(TypeDichvu typeDichvu);
}
