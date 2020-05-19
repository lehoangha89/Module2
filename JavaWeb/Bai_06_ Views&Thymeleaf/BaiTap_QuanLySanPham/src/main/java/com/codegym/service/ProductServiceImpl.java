package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Versace Eros",1800000,"Versace"));
        products.put(2,new Product(2,"La Nuit de LHomme",2650000,"Yves Saint Laurent"));
        products.put(3,new Product(3,"Bleu De Chanel",3150000,"Chanel"));
        products.put(4,new Product(4,"Bvlgari Aqua Pour Homme",2250000,"Bvlgari"));
        products.put(5,new Product(5,"Creed Aventus",6481000,"Creed"));
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
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}