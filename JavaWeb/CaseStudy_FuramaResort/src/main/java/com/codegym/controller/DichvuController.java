package com.codegym.controller;

import com.codegym.model.Dichvu;
import com.codegym.model.TypeDichvu;
import com.codegym.model.TypeOfRent;
import com.codegym.service.DichvuService;
import com.codegym.service.TypeDichvuService;
import com.codegym.service.TypeOfRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class DichvuController {
    @Autowired
    private DichvuService dichvuService;
    @Autowired
    private TypeDichvuService typeDichvuService;
    @Autowired
    private TypeOfRentService typeOfRentService;

    @ModelAttribute("type_service")
    public Iterable<TypeDichvu> typeDichvus() {
        return typeDichvuService.findAll();
    }
    @ModelAttribute("type_ofRent")
    public Iterable<TypeOfRent> typeOfRents() {
        return typeOfRentService.findAll();
    }

    @GetMapping("/list-service")
    public ModelAndView listService(@RequestParam("keyword") Optional<String> keyword, @PageableDefault(size = 3) Pageable pageable) {
        Page<Dichvu> dichvus;
        String keywordService=null;
        if (keyword.isPresent()) {
            keywordService=keyword.get();
            dichvus = dichvuService.findAllByNameServiceContaining(keywordService, pageable);
        } else {
            dichvus = dichvuService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("service/list");
        modelAndView.addObject("keyword",keywordService);
        modelAndView.addObject("serviceList", dichvus);
        if (dichvus.getTotalPages() == 0) {
            modelAndView.addObject("message", "Not found!");
        }
        return modelAndView;
    }

    @GetMapping("/create-service")
    public ModelAndView showCreateService() {
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("serviceCreate", new Dichvu());
        return modelAndView;
    }

    @PostMapping("/create-service")
    public ModelAndView saveService(@Validated @ModelAttribute("serviceCreate") Dichvu dichvu,
                                    BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("service/create");
            return modelAndView;
        }
        dichvuService.save(dichvu);
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("serviceCreate", new Dichvu());
        modelAndView.addObject("message", "Tạo mới thành công");
        return modelAndView;
    }


    @GetMapping("/edit-service/{id}")
    public ModelAndView editService(@PathVariable Long id) {
        Dichvu dichvu = dichvuService.findById(id);
        if (dichvu != null) {
            ModelAndView modelAndView = new ModelAndView("service/edit");
            modelAndView.addObject("serviceEdit", dichvu);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("erorr.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-service")
    public ModelAndView updateService(@Validated @ModelAttribute("serviceEdit") Dichvu dichvu,
                                      BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("service/edit");
            return modelAndView;
        }
        dichvuService.save(dichvu);
        ModelAndView modelAndView = new ModelAndView("service/edit");
        modelAndView.addObject("serviceEdit", dichvu);
        modelAndView.addObject("message", "Service updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-service/{id}")
    public ModelAndView showDelete(@PathVariable Long id) {
        Dichvu dichvu = dichvuService.findById(id);
        if (dichvu != null) {
            ModelAndView modelAndView = new ModelAndView("service/delete");
            modelAndView.addObject("serviceDelete", dichvu);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("erorr.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-service")
    public String remove(@ModelAttribute("service") Dichvu dichvu) {
        dichvuService.delete(dichvu.getId());
        return "redirect:list-service";
    }

}
