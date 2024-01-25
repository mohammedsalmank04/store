package com.learnSpringBoot.store.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_statuses")
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_status_id")
    private int id;
    @Column(name = "name")
    private String name;

    public OrderStatus() {
    }

    public OrderStatus(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
