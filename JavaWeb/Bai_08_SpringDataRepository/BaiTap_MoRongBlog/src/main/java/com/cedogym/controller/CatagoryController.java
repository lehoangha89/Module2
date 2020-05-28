package com.cedogym.controller;

import com.cedogym.model.Category;
import com.cedogym.service.BlogService;
import com.cedogym.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CatagoryController {
    @Autowired
    private CatagoryService catagoryService;
    @Autowired
    private BlogService blogService;

//    @GetMapping("/")
//    public ModelAndView show() {
//        ModelAndView modelAndView = new ModelAndView("/index");
//        return modelAndView;
//    }

    @GetMapping("/categorys")
    public ModelAndView listCatagory(@RequestParam("keyword") Optional<String> keyword, @PageableDefault(size = 2) Pageable pageable) {
        Page<Category> categories;
        String keywordCategory = null;
        if (keyword.isPresent()) {
            keywordCategory = keyword.get();
            categories = catagoryService.findAllByNameContaining (keywordCategory, pageable);
        } else {
            categories = catagoryService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("category/list");
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @GetMapping("/create-category")
    public ModelAndView showCategory() {
        ModelAndView modelAndView = new ModelAndView("category/create");
        modelAndView.addObject("category",new Category());
        return modelAndView;
    }

    @PostMapping("/create-category")
    public ModelAndView saveProvince(@ModelAttribute("category") Category category){
        catagoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Category());
        modelAndView.addObject("message", "New category created successfully");
        return modelAndView;
    }

    @GetMapping("/edit-category/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Category category = catagoryService.findById(id);
        if (category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/edit");
            modelAndView.addObject("category", category);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-category")
    public ModelAndView updateProvince(@ModelAttribute("category") Category category) {
        catagoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/edit");
        modelAndView.addObject("category", category);
        modelAndView.addObject("message", "Updated successfully");
        return modelAndView;
    }

    @GetMapping("/delete-category/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Category category = catagoryService.findById(id);
        if (category != null) {
            ModelAndView modelAndView = new ModelAndView("/category/delete");
            modelAndView.addObject("category", category);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-category")
    public String deleteProvince(@ModelAttribute("province") Category category) {
        catagoryService.remove(category.getId());
        return "redirect:categorys";
    }

    @GetMapping("/list-category/{id}")
    public ModelAndView list(@PathVariable Long id){
        ModelAndView modelAndView=new ModelAndView("/category/read");
        modelAndView.addObject("cate",blogService.findById(id));
        return modelAndView;
    }

}
