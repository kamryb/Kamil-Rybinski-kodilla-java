package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop extends Supplier {


    public GlutenFreeShop(String suppInfo, Double prodQuantity, String prodType) {
        super(suppInfo,prodQuantity,prodType);
    }



    @Override
    public String process() {
        return "Process ready2";
    }


}
