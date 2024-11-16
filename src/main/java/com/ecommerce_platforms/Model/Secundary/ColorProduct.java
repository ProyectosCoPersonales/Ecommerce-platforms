package com.ecommerce_platforms.Model.Secundary;

import java.util.List;

import com.ecommerce_platforms.Model.Primary.Product;
import com.ecommerce_platforms.Model.Tertiary.Images;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "colorProduct")
public class ColorProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 10)
    private String color;
    @OneToMany(targetEntity = Images.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Images> imgs;
    @ManyToOne(targetEntity = Product.class)
    private Product product;
    public ColorProduct(Product product) {
        this.product = product;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public List<Images> getImgs() {
        return imgs;
    }
    public void setImgs(List<Images> imgs) {
        this.imgs = imgs;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
}
