package com.codegym.repository;

import com.codegym.model.LevelEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LevelEmployeeRepository extends JpaRepository<LevelEmployee,Long> {
}
