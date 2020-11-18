package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {


    private User user;
    private Product product;
    private int quantity;
    private LocalDateTime time;

    public OrderRequest(User user, Product product, int quantity, LocalDateTime time) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
