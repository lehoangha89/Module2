package com.codegym.controller;

import com.codegym.model.PositionEmployee;
import com.codegym.service.PositionEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PositionEmployeeController {
    @Autowired
    private PositionEmployeeService positionEmployeeService;
    @GetMapping("/create-position")
    public ModelAndView showPosition(){
        ModelAndView modelAndView=new ModelAndView("/employee/position");
        modelAndView.addObject("createPosition",new PositionEmployee());
        return modelAndView;
    }

    @PostMapping("/create-position")
    public ModelAndView savePosition(@Valid @ModelAttribute("createPosition") PositionEmployee positionEmployee,
                                     BindingResult bindingResult){
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView=new ModelAndView("employee/position");
            return modelAndView;
        }
        positionEmployeeService.save(positionEmployee);
        ModelAndView modelAndView=new ModelAndView("employee/position");
        modelAndView.addObject("createPosition",new PositionEmployee());
        modelAndView.addObject("message","Tạo mới thành công");
        return modelAndView;
    }

}
