package com.learnSpringBoot.store.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity_in_stock")
    private int quantityInStock;
    @Column(name = "unit_price")
    private double unitPrice;

    public Product() {
    }

    public Product(String name, int quantityInStock, double unitPrice) {
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
