package com.codegym.repository;

import com.codegym.model.Dichvu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DichvuRepository extends JpaRepository<Dichvu,Long> {
    Page<Dichvu> findAllByNameServiceContaining(String nameService, Pageable pageable);
}
