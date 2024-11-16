package com.ecommerce_platforms.Repository.Secundary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce_platforms.Model.Secundary.ItemToCart;

public interface ItemToCartRepository extends JpaRepository<ItemToCart,Long> {
    
}
