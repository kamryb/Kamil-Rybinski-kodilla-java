package com.kodilla.good.patterns.food2Door;

public abstract class Supplier {
    public String suppInfo;
    public Double prodQuantity;
    public  String prodType;




    public Supplier(String suppInfo, Double prodQuantity, String prodType) {
        this.suppInfo = suppInfo;
        this.prodQuantity = prodQuantity;
        this.prodType = prodType;
    }

    public abstract String process(Order order);


    public String getSuppInfo() {
        return suppInfo;
    }

    public Double getProdQuantity() {
        return prodQuantity;
    }

    public String getProdType() {
        return prodType;
    }



}
