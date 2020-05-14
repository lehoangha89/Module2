package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> product;
    static{
        product=new HashMap<>();
        product.put(1,new Product(1,"Versace Eros",2200.0,"Versace"));
        product.put(2,new Product(2,"Chanel Bleu",2700.0,"Chanel"));
        product.put(3,new Product(3,"Creed Aventus",7000.0,"Creed"));
        product.put(4,new Product(4,"La Nuit De L’Homme",2800.0,"Yves Saint Laurent"));
        product.put(5,new Product(5,"Allure Homme Sport",2700.0,"Chanel"));
        product.put(6,new Product(6,"BVLGARI Aqva Pour Homme",3200.0,"BVLGARI"));
        product.put(7,new Product(7,"Do Son",9200.0,"Diptyque"));
        product.put(8,new Product(8,"Tam Dao",9200.0,"Diptyque"));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }
}
