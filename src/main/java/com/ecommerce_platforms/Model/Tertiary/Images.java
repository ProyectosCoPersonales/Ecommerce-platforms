package com.ecommerce_platforms.Model.Tertiary;
import com.ecommerce_platforms.Model.Secundary.ColorProduct;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "images")
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "TEXT")
    private String url;
    @ManyToOne(targetEntity = ColorProduct.class)
    private ColorProduct colorProduct;
    public Long getId() {
        return id;
    }
    public Images() {
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public ColorProduct getColorProduct() {
        return colorProduct;
    }
    public void setColorProduct(ColorProduct colorProduct) {
        this.colorProduct = colorProduct;
    }
    
}
