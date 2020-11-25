package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop extends Supplier {

    public ExtraFoodShop(String suppInfo, Double prodQuantity, String prodType) {
        super(suppInfo,prodQuantity,prodType);
    }



    @Override
    public String process() {
        return "Process ready";
    }

}
