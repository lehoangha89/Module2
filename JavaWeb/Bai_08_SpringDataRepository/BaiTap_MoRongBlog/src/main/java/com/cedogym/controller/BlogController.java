package com.cedogym.controller;


import com.cedogym.model.Blog;
import com.cedogym.model.Category;
import com.cedogym.service.BlogService;
import com.cedogym.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @Autowired
    private CatagoryService catagoryService;

    @ModelAttribute("categorys")
    public Page<Category> categories(Pageable pageable) {
        return catagoryService.findAll(pageable);
    }

    @GetMapping("/blogs")
    public ModelAndView listBlog(@RequestParam("keyword") Optional<String> keyword, @PageableDefault(size = 2) Pageable pageable) {
        Page<Blog> blogs;
        String keywordBlog = null;
        if (keyword.isPresent()) {
            keywordBlog = keyword.get();
            blogs = blogService.findAllByFirstNameContaining(keywordBlog, pageable);
        } else {
            blogs = blogService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {

        Date day = new Date();
        blog.setDay(day);
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "Tạo Mới Thành Công");
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-blog")
    public ModelAndView updateCustomer(@ModelAttribute("blog") Blog blog) {
        Date day = new Date();
        blog.setDay(day);
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Thay Đổi Thành Công");
        return modelAndView;
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;

        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete-blog")
    public String deleteCustomer(@ModelAttribute("blog") Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:blogs";
    }

    @GetMapping("/read-blog/{id}")
    public ModelAndView read(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("blog/read");
        modelAndView.addObject("blog", blogService.findById(id));
        return modelAndView;
    }
//    @GetMapping("/list-category/{id}")
//    public ModelAndView list(@PathVariable Long id){
//        ModelAndView modelAndView=new ModelAndView("/category/read");
//        modelAndView.addObject("cate",catagoryService.findById(id));
//        return modelAndView;
//    }

}
