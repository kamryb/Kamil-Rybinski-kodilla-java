package com.kodilla.good.patterns.food2Door;

public class Order {
    private String nameSupplier;
    private String product;
    private Integer quantity;

    public Order(String nameSupplier, String product, Integer quantity) {
        this.nameSupplier = nameSupplier;
        this.product = product;
        this.quantity = quantity;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public String getProduct() {
        return product;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
