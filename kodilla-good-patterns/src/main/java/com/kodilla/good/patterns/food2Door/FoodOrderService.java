package com.kodilla.good.patterns.food2Door;

import com.kodilla.good.patterns.challenges.MailService;
import com.kodilla.good.patterns.challenges.OrderRepository;
import com.kodilla.good.patterns.challenges.OrderService;

public class FoodOrderService {


    public void process(final Order order) throws Exception {
        String orderNameSupplier = order.getNameSupplier();
        Supplier supplier = null ;
        if (orderNameSupplier.equals("ExtraFoodShop")) {
            supplier = new ExtraFoodShop("E", 1D, "T1");


        } else if (orderNameSupplier.equals("HealthyShop")) {
            supplier = new ExtraFoodShop("Ex", 2D, "T3");
        } else if (orderNameSupplier.equals("GlutenFreeShop")) {
            supplier = new ExtraFoodShop("E", 3D, "T5");
        } else {
            throw new Exception("No supplier");


        }
        supplier.process(order);

    }


}
