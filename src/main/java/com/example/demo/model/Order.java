package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;


import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Getter
@Setter
@Table(name = "t_orders")
public class Order {

   @jakarta.persistence.Id
   @GeneratedValue(strategy = IDENTITY)
   private Long Id;

    private String orderNumber;
    private String skuCode;



    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    private BigDecimal price;
    private Integer quantity;


}








