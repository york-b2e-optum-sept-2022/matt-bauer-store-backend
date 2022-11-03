package net.yorksolutions.shopiflystorebackend.models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
public class Cart {
    @Id
    public UUID id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<ProductList> productList;
    public Double subTotal;
    public Double taxTotal;
    public Double shippingTotal;
    public Double costTotal;
}
