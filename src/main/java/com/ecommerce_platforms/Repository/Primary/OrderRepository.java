package com.ecommerce_platforms.Repository.Primary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce_platforms.Model.Primary.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}