package net.yorksolutions.shopiflystorebackend.controllers;

import net.yorksolutions.shopiflystorebackend.models.Product;
import net.yorksolutions.shopiflystorebackend.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    //used only in backend to add products to db
    @PostMapping
    public void addProducts(@RequestBody Product[] products) {
        productService.addProducts(products);
    }

}
