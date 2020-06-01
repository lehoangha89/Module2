package com.codegym.controller;

import com.codegym.model.Contract;
import com.codegym.model.Customer;
import com.codegym.model.CustomerType;
import com.codegym.service.ContractService;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    //    @Autowired
//    private ContractService contractService;
    @Autowired
    private CustomerTypeService customerTypeService;

    @ModelAttribute("customer_type")
    public Iterable<CustomerType> customerTypes() {
        return customerTypeService.findAll();
    }

    @GetMapping("/list-customer")
    public ModelAndView listCustomer(@RequestParam("keyword") Optional<String> keyword, @PageableDefault(size = 3) Pageable pageable) {
        Page<Customer> customers;
        String keywordCustomer=null;
        if (keyword.isPresent()) {
            keywordCustomer=keyword.get();
            customers = customerService.findAllByNameContaining(keywordCustomer, pageable);
        } else {
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("keyword",keywordCustomer);
        modelAndView.addObject("customerList", customers);
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView showCreateCustomer() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customerCreate", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customerCreate", new Customer());
        modelAndView.addObject("message", "Tạo mới thành công");
        return modelAndView;
    }

    @GetMapping("/edit-customer/{id}")
    public ModelAndView editCustomer(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customerEdit", customer);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("erorr.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView updateCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("customerEdit", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showDelete(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            ModelAndView modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customerDelete", customer);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("erorr.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-customer")
    public String remove(@ModelAttribute("customer") Customer customer) {
        customerService.delete(customer.getId());
        return "redirect:list-customer";
    }
}
