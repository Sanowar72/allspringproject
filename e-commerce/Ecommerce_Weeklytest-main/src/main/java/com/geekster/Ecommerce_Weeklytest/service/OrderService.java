package com.geekster.Ecommerce_Weeklytest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekster.Ecommerce_Weeklytest.model.Order;
import com.geekster.Ecommerce_Weeklytest.repo.OrderRepo;

@Service
public class OrderService {

    @Autowired
    private OrderRepo OrderRepo;

    public List<Order> getOrder(Integer orderid) {
        List<Order> orders = new ArrayList<>();
        orders.add(OrderRepo.findById(orderid).get());
        return orders;
    }


}
