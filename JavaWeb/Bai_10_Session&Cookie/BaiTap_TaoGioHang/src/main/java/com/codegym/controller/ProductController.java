package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    ProductService productService;

    @ModelAttribute("cart")
    public Cart setupCount() {
        return new Cart();
    }

    @GetMapping("/")
    public ModelAndView show(@ModelAttribute("cart") Cart cart) {
        ModelAndView modelAndView = new ModelAndView("index");
        Iterable<Product> listProduct = productService.findAllProduct();
        modelAndView.addObject("productList", listProduct);
        return modelAndView;
    }

    @GetMapping("/product/{id}")
    public ModelAndView showProduct(@PathVariable("id") Long id, @ModelAttribute("cart") Cart cart) {
        ModelAndView modelAndView = new ModelAndView("product");
        Optional<Product> product = productService.findProductById(id);
        modelAndView.addObject("aproduct", product);
        return modelAndView;
    }

    @GetMapping("/buy/{id}")
    public ModelAndView buyProduct(@PathVariable("id") Long id, @ModelAttribute("cart") Cart cart) {
        ModelAndView modelAndView = new ModelAndView("product");
        Optional<Product> product = productService.findProductById(id);
        boolean have = false;
        for (Map.Entry<String, Optional<Product>> entry : cart.getListProduct().entrySet()) {
            if (entry.getValue().get().getName().equals(product.get().getName())) {
                have = true;
                break;
            }
        }
        if (have == false) {
            cart.addProduct(product);
            cart.getListProduct().get(product.get().getName()).get().addAmount();
        } else {
            for (Map.Entry<String, Optional<Product>> entry : cart.getListProduct().entrySet()) {
                if (entry.getValue().get().getName().equals(product.get().getName())) {
                    entry.getValue().get().addAmount();
                    break;
                }
            }
        }
        modelAndView.addObject("aproduct", product);
        return modelAndView;
    }

    @GetMapping("/cart")
    public ModelAndView cart(@ModelAttribute("cart") Cart cart) {
        ModelAndView modelAndView = new ModelAndView("cart");
        cart.setTotal(0);
        cart.sumMoney();
        return modelAndView;
    }
}
