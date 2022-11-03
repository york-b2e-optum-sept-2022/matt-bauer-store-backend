package net.yorksolutions.shopiflystorebackend.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    public String name;
    public String imgUrl;
    public Double price;
    public Double rating;
}
