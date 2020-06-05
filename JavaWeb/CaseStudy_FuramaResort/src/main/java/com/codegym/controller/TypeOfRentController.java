package com.codegym.controller;

import com.codegym.model.TypeOfRent;
import com.codegym.service.TypeOfRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class TypeOfRentController {
    @Autowired
    private TypeOfRentService typeOfRentService;

    @GetMapping("/create-typeOfrent")
    public ModelAndView showTypeofrent(){
        ModelAndView modelAndView=new ModelAndView("typeOfRent/create");
        modelAndView.addObject("createTypeOfRent",new TypeOfRent());
        return modelAndView;
    }

    @PostMapping("/create-typeOfrent")
    public ModelAndView saveTypeOfRent(@Valid @ModelAttribute ("typeOfRent") TypeOfRent typeOfRent,
                                       BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView=new ModelAndView("typeOfRent/create");
            return modelAndView;
        }
        typeOfRentService.save(typeOfRent);
        ModelAndView modelAndView=new ModelAndView("typeOfRent/create");
        modelAndView.addObject("createTypeOfRent",new TypeOfRent());
        modelAndView.addObject("message","Tạo mới thành công");
        return modelAndView;
    }

}
