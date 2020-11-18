package com.kodilla.good.patterns.challenges;

import javax.xml.ws.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Application {



    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest request = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService =
                new ProductOrderService(new MailService(),new OrderService(), new OrderRepository());
        productOrderService.process(request);

    }






}
