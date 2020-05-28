package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import com.codegym.service.BlogService;
import com.codegym.service.CatagoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogControllerRestful {

    @Autowired
    private BlogService blogService;

    @Autowired
    private CatagoryService catagoryService;

    @GetMapping("/blogs-restful/")
    public ResponseEntity<List<Blog>> listAllBlog() {
        List<Blog> blogs = blogService.findAll2();

        return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
    }

    @GetMapping("/blogs-restful/{id}")
    public ResponseEntity<Blog> getIdBlog(@PathVariable Long id){
        Blog blog=blogService.findById(id);
        return new ResponseEntity<Blog>(blog,HttpStatus.OK);
    }

    @GetMapping("/category-restful/")
    public ResponseEntity<List<Category>> listAllCategory(){
        List<Category> categories= catagoryService.findAll2();
        return  new ResponseEntity<List<Category>>(categories, HttpStatus.OK);
    }

}