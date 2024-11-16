package com.ecommerce_platforms.Model.Primary;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import com.ecommerce_platforms.Model.Secundary.ColorProduct;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String codeProduct;
    @Column(length = 150)
    private String name;
    @OneToMany(targetEntity = ColorProduct.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ColorProduct> colors;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Double price;
    @Column(length = 20)
    private String createdTo;

    public Product() {
    }

    
    public List<ColorProduct> getColors() {
        return colors;
    }
    public void setColors(List<ColorProduct> colors) {
        this.colors = colors;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @PrePersist
    private void PrePersist(){
        this.codeProduct = "PRODUCT-"+UUID.randomUUID().toString();
        this.createdTo = LocalDate.now().toString();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodeProduct() {
        return codeProduct;
    }
    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getCreatedTo() {
        return createdTo;
    }
    public void setCreatedTo(String createdTo) {
        this.createdTo = createdTo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }
}
