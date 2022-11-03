package net.yorksolutions.shopiflystorebackend.services;

import net.yorksolutions.shopiflystorebackend.models.Cart;
import net.yorksolutions.shopiflystorebackend.models.ProductList;
import net.yorksolutions.shopiflystorebackend.repositories.CartRepository;
import net.yorksolutions.shopiflystorebackend.repositories.ProductListRepo;
import net.yorksolutions.shopiflystorebackend.repositories.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CartService {

    CartRepository cartRepository;
    ProductListRepo productListRepo;

    public CartService(CartRepository cartRepository, ProductListRepo productListRepo) {
        this.cartRepository = cartRepository;
        this.productListRepo = productListRepo;
    }

    public Optional<Cart> getCartById(UUID id) {
        return cartRepository.findById(id);
    }

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(UUID id, Cart cart) {
//        for (ProductList item : cart.productList) {
//            if (item.id != null) {
//                System.out.println(item.id);
//                productListRepo.deleteById(item.id);
//            }
//        }
        return cartRepository.save(cart);
    }

}

