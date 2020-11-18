package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface Service {

    boolean createOrder(User user, Product product, int quantity, LocalDateTime time);
}
