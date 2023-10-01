package com.kz.orders.services;

import com.kz.orders.entityes.Order;
import com.kz.orders.entityes.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderService {
    public List<OrderDTO> getAllOrders();

    public OrderDTO getOrderByNumber(String number);
}
