package com.kodilla.good.patterns.food2Door;

public class HealthyShop extends Supplier{

    public HealthyShop(String suppInfo, Double prodQuantity, String prodType) {

        super(suppInfo,prodQuantity,prodType);
    }



    @Override
    public String process() {
        return "Process ready3";
    }


}
