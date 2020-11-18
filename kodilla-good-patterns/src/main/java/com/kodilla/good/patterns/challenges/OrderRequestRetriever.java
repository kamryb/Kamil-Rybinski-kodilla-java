package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User ("Order1");
        LocalDateTime time = LocalDateTime.of(2020, 8, 1, 12 ,0);
        Product product = new Product("Test");
        int quantity = 10;


        return new OrderRequest(user, product, quantity, time);
    }
}
