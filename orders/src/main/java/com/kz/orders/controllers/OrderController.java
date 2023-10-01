package com.kz.orders.controllers;
//Заказ
import com.kz.orders.entityes.dto.OrderDTO;
import com.kz.orders.services.OrderService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/getAllOrders")
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }
    @GetMapping("/getByNumber")
    public OrderDTO getByNumber(@RequestParam String number) {
        return orderService.getOrderByNumber(number);
    }
}
