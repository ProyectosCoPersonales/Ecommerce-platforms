package com.ecommerce_platforms.Repository.Primary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce_platforms.Model.Primary.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
