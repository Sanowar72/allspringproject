package com.geekster.Ecommerce_Weeklytest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.geekster.Ecommerce_Weeklytest. model.Order;
import com.geekster.Ecommerce_Weeklytest. service.OrderService;



@RestController
//@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "getOrder/{orderid}")
    public List<Order> getOrderById(@PathVariable Integer orderid) {
        return orderService.getOrder(orderid);
    }


}

