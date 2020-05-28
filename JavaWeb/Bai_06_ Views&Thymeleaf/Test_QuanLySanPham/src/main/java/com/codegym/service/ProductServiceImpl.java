package com.codegym.service;


import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImpl implements ProductService {
    public static Map<Integer,Product> products=new HashMap<>();
    static {
        products.put(1,new Product(1,"Banh mi",20000,"Dong tien"));
        products.put(2,new Product(2,"Banh bong lan",22000,"Big C"));
        products.put(3,new Product(3,"Kem bo",15000,"Cho Bac My An"));
        products.put(4,new Product(4,"Bun bo Hue",20000,"Quan Mu Roi"));
        products.put(5,new Product(5,"Bun Mam",20000,"Cho Con"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
