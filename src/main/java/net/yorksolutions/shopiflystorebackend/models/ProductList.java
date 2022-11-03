package net.yorksolutions.shopiflystorebackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProductList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long id;
    public Integer count;
    @OneToOne
    public Product product;
}
