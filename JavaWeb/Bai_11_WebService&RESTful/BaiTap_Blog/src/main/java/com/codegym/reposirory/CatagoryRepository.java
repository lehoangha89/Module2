package com.codegym.reposirory;

import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatagoryRepository extends JpaRepository<Category,Long> {
Page<Category> findAllByNameContaining(String name, Pageable pageable);
}
