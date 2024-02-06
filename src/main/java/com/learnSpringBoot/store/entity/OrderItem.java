package com.learnSpringBoot.store.entity;

import jakarta.persistence.*;
import org.hibernate.mapping.Join;

@Entity
@Table(name = "order_items")
//@IdClass(OrderItemId.class)
public class OrderItem {

    /*//@ManyToOne
    //@JoinColumn(name = "order_id")
    @Id
    @Column(name = "order_id")
    private int orderId;
    //@OneToOne()
    //@JoinColumn(name = "product_id")
    @Id
    @Column(name = "product_id")
    private int productId;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "unit_price")
    private double unitPrice;*/
    @EmbeddedId
    private OrderItemId id;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "unit_price")
    private double unitPrice;

    public OrderItem() {
    }

    public OrderItem(OrderItemId id, int quantity, double unitPrice) {
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public OrderItemId getId() {
        return id;
    }

    public void setId(OrderItemId id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
