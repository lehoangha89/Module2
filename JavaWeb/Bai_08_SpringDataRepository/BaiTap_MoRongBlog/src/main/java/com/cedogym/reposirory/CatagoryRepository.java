package com.cedogym.reposirory;

import com.cedogym.model.Blog;
import com.cedogym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatagoryRepository extends JpaRepository<Category,Long> {
Page<Category> findAllByNameContaining(String name,Pageable pageable);
}
