package com.ecommerce_platforms.Model.Primary;

import com.ecommerce_platforms.Model.Secundary.ItemToCart;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "carts")
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(targetEntity = ItemToCart.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ItemToCart items;
    @Column(name = "sub_total")
    private Double SubTotal;
}
