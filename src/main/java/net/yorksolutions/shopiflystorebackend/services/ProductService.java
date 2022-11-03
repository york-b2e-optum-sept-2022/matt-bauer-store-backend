package net.yorksolutions.shopiflystorebackend.services;

import net.yorksolutions.shopiflystorebackend.models.Product;
import net.yorksolutions.shopiflystorebackend.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepo repository;

    @Autowired
    public ProductService(ProductRepo repository) {
        this.repository = repository;
    }

    public Iterable<Product> getAllProducts() {
        return repository.findAll();
    }

    public void addProducts(Product[] products) {
        for (Product product : products) {
            repository.save(product);
        }
    }

}
