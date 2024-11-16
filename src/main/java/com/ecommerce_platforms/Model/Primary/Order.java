package com.ecommerce_platforms.Model.Primary;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nameUser;
    private LocalDate dateToOrder;
    private LocalTime timeToOrder;
    private Double total;
    @Enumerated(EnumType.STRING)
    private StatusToOrder status;

    public enum StatusToOrder{
        PENDING,
        COMPLETED
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public LocalDate getDateToOrder() {
        return dateToOrder;
    }

    public void setDateToOrder(LocalDate dateToOrder) {
        this.dateToOrder = dateToOrder;
    }

    public LocalTime getTimeToOrder() {
        return timeToOrder;
    }

    public void setTimeToOrder(LocalTime timeToOrder) {
        this.timeToOrder = timeToOrder;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public StatusToOrder getStatus() {
        return status;
    }

    public void setStatus(StatusToOrder status) {
        this.status = status;
    }
    
}

