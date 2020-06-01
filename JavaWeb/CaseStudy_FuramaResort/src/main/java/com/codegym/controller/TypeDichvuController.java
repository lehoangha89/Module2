package com.codegym.controller;

import com.codegym.model.TypeDichvu;
import com.codegym.service.TypeDichvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TypeDichvuController {
    @Autowired
    private TypeDichvuService typeDichvuService;
    @GetMapping("/typeService-create")
    public ModelAndView showCustomerType(){
        ModelAndView modelAndView=new ModelAndView("typeService/create");
        modelAndView.addObject("createTypeService",new TypeDichvu());
        return modelAndView;
    }
    @PostMapping("/typeService-create")
    public ModelAndView createType(@ModelAttribute("typeDichvu") TypeDichvu typeDichvu){
        typeDichvuService.save(typeDichvu);
        ModelAndView modelAndView=new ModelAndView("typeService/create");
        modelAndView.addObject("createTypeService",new TypeDichvu());
        modelAndView.addObject("message","Tao moi loai dich vu thanh cong");
        return modelAndView;
    }
}
