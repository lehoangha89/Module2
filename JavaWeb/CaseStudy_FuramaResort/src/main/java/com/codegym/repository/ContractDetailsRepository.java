package com.codegym.repository;

import com.codegym.model.ContractDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDetailsRepository extends JpaRepository<ContractDetails,Long> {
}
