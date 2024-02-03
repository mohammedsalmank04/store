package com.learnSpringBoot.store.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import org.hibernate.annotations.JoinColumnOrFormula;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;
    @OneToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @Column(name = "order_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private String orderDate;
    @Column(name = "status")
    private int status;
    @Column(name="comments")
    @Nullable
    private String comments;
    @Column(name = "shipped_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    @Nullable
    private String shippedDate;
    @Column(name = "shipper_id")
    @Nullable
    private int shipperId;
    @OneToOne(mappedBy = "order",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH} )
    private OrderItemNote orderItemNote;

    public Order() {
    }

    public Order(String orderDate, int status, @Nullable String comments, @Nullable String shippedDate, int shipperId) {
        this.orderDate = orderDate;
        this.status = status;
        this.comments = comments;
        this.shippedDate = shippedDate;
        this.shipperId = shipperId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(String shippedDate) {
        this.shippedDate = shippedDate;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {

        this.shipperId = shipperId;
    }

    public OrderItemNote getOrderItemNote() {
        return orderItemNote;
    }

    public void setOrderItemNote(OrderItemNote orderItemNote) {
        this.orderItemNote = orderItemNote;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", orderDate='" + orderDate + '\'' +
                ", status=" + status +
                ", comments='" + comments + '\'' +
                ", shippedDate='" + shippedDate + '\'' +
                ", shipperId=" + shipperId +
                ", orderItemNote=" + orderItemNote +
                '}';
    }
}
