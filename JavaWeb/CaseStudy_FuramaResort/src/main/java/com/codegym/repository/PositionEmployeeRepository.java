package com.codegym.repository;

import com.codegym.model.PositionEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionEmployeeRepository extends JpaRepository<PositionEmployee,Long> {
}
