package com.codegym.controller;

import com.codegym.model.CustomerType;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerTypeController {

    @Autowired
    private CustomerTypeService customerTypeService;
    @Autowired
    private CustomerService customerService;

    @GetMapping("/type-create")
    public ModelAndView showCustomerType(){
        ModelAndView modelAndView=new ModelAndView("customerType/create");
        modelAndView.addObject("createType",new CustomerType());
        return modelAndView;
    }
    @PostMapping("/type-create")
    public ModelAndView createType(@ModelAttribute ("customerType") CustomerType customerType){
        customerTypeService.save(customerType);
        ModelAndView modelAndView=new ModelAndView("customerType/create");
        modelAndView.addObject("createType",new CustomerType());
        modelAndView.addObject("message","Tao moi loai khach thanh cong");
        return modelAndView;
    }
}
