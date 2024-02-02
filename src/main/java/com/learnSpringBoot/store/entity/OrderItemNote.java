package com.learnSpringBoot.store.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_item_notes")
public class OrderItemNote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id")
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id") // foreign ket
    private Order order;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "note")
    private String note;

    public OrderItemNote() {
    }

    public OrderItemNote(Order order, int productId, String note) {
        this.order = order;
        this.productId = productId;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "OrderItemNotes{" +
                "id=" + id +
                ", order=" + order +
                ", productId=" + productId +
                ", note='" + note + '\'' +
                '}';
    }
}
