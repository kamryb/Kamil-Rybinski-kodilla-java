package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private Service service;
    private Order order;
    private Customer customer;

    public ProductOrderService(Service service, Order order, Customer customer) {
        this.service = service;
        this.order = order;
        this.customer = customer;
    }

    public ProductOrderService(MailService mailService, OrderService orderService, OrderRepository orderRepository) {

    }

    public ProductOrderDto process (final OrderRequest orderRequest) {

        boolean isOrdered = service.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getTime());
        customer.getCustomer(orderRequest.getUser());

        if (isOrdered) {
            order.getName(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getTime());
            return new ProductOrderDto(orderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(orderRequest.getUser(),false);
        }

    }



    }




