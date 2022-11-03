package net.yorksolutions.shopiflystorebackend.repositories;

import net.yorksolutions.shopiflystorebackend.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends CrudRepository<Product, String> {
}
