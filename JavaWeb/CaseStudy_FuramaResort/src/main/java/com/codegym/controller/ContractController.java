package com.codegym.controller;

import com.codegym.model.*;

import com.codegym.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ContractController {
    @Autowired
    private ContractService contractService;
    @Autowired
    private ContractDetailsService contractDetailsService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private DichvuService dichvuService;

    @ModelAttribute("contract_detail")
    public Iterable<ContractDetails> contractDetails() {
        return contractDetailsService.findAll();
    }

    @ModelAttribute("employees")
    public Page<Employee> employees(Pageable pageable) {
        return employeeService.findAll(pageable);
    }

    @ModelAttribute("customers")
    public Page<Customer> customers(Pageable pageable) {
        return customerService.findAll(pageable);
    }

    @ModelAttribute("dichvus")
    public Page<Dichvu> dichvus(Pageable pageable) {
        return dichvuService.findAll(pageable);
    }


    @GetMapping("/list-contract")
    public ModelAndView listContract(@RequestParam("keyword") Optional<String> keyword, @PageableDefault(size = 3) Pageable pageable) {
        Page<Contract> contracts = contractService.findAll(pageable);
//        String keywordContract=null;
//        if (keyword.isPresent()) {
//            keywordContract=keyword.get();
//            contracts = contractService.findAllByNameContaining(keywordCustomer, pageable);
//        } else {
//            customers = customerService.findAll(pageable);
//        }
        ModelAndView modelAndView = new ModelAndView("contract/list");
//        modelAndView.addObject("keyword",keywordContract);
        modelAndView.addObject("contractList", contracts);
        return modelAndView;
    }

    @GetMapping("/create-contract")
    public ModelAndView showContract() {
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("createContract", new Contract());
        return modelAndView;
    }

    @PostMapping("/create-contract")
    public ModelAndView saveContract(@Valid @ModelAttribute("createContract") Contract contract,
                                     BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("contract/create");
            return modelAndView;
        }
        contractService.save(contract);
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("createContract",contract);
        modelAndView.addObject("message", "Tạo mới thành công");
        return modelAndView;
    }

    @GetMapping("/edit-contract/{id}")
    public ModelAndView editContract(@PathVariable Long id) {
        Contract contract = contractService.findById(id);
        if (contract != null) {
            ModelAndView modelAndView = new ModelAndView("contract/edit");
            modelAndView.addObject("contractEdit", contract);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("erorr.404");
        return modelAndView;
    }

    @PostMapping("/edit-contract")
    public ModelAndView updateContract(@Validated @ModelAttribute("contractEdit") Contract contract,
                                       BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("/contract/edit");
            return modelAndView;
        }
        contractService.save(contract);
        ModelAndView modelAndView = new ModelAndView("/contract/edit");
        modelAndView.addObject("message", "Contract updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-contract/{id}")
    public ModelAndView showDelete(@PathVariable Long id) {
        Contract contract = contractService.findById(id);
        if (contract != null) {
            ModelAndView modelAndView = new ModelAndView("contract/delete");
            modelAndView.addObject("contractDelete", contract);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("erorr.404");
        return modelAndView;
    }

    @PostMapping("/delete-contract")
    public String remove(@ModelAttribute("contractDelete") Contract contract) {
        contractService.delete(contract.getId());
        return "redirect:list-contract";
    }
}
