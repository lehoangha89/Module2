package com.codegym.controller;

import com.codegym.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ContractController {
    @Autowired
    private ContractService contractService;
}
