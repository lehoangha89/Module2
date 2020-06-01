package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("user")
public class LoginController {
    @GetMapping("/")
    public ModelAndView login() {
        ModelAndView modelAndView=new ModelAndView("login");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView dashboard(@ModelAttribute("user") User user) {
        ModelAndView modelAndView=new ModelAndView("dashboard");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
//    @GetMapping("/dashboard")
//    public String login() {
//        return "dashboard";
//    }
}
