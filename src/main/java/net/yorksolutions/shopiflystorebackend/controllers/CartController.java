package net.yorksolutions.shopiflystorebackend.controllers;

import net.yorksolutions.shopiflystorebackend.models.Cart;
import net.yorksolutions.shopiflystorebackend.services.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/carts")
@CrossOrigin
public class CartController {

    CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/{id}")
    public Optional<Cart> getCartById(@PathVariable UUID id) {
        return cartService.getCartById(id);
    }

    @PostMapping
    public Cart addCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }

    @PutMapping("/{id}")
    public Cart updateCart(@PathVariable UUID id, @RequestBody Cart cart) {
        return cartService.updateCart(id, cart);
    }
}
