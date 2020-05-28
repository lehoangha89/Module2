package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public ModelAndView show() {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("member", new User());
        return modelAndView;
    }

    @PostMapping("/result")
    public ModelAndView saveMember(@Validated @ModelAttribute("member") User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("/index");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("/result");
        userService.saveUser(user);
        modelAndView.addObject("member",user);
        return modelAndView;
    }
}
