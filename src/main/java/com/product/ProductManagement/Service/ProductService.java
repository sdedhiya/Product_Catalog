package com.product.ProductManagement.Service;

import com.product.ProductManagement.Model.Product;
import com.product.ProductManagement.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public void saveProduct(Product product){
         repository.save(product);
    }


    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {

        return repository.findByCategory(category);
    }

}
