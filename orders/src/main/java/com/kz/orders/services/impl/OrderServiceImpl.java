package com.kz.orders.services.impl;

import com.kz.orders.entityes.Order;
import com.kz.orders.entityes.dto.OrderDTO;
import com.kz.orders.mappers.OrderMapper;
import com.kz.orders.repositoryes.OrderRepository;
import com.kz.orders.services.OrderService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    @Override
    public List<OrderDTO> getAllOrders() {
        return OrderMapper.ORDER_MAPPER.toListDTO(orderRepository.findAll());
    }

    @Override
    public OrderDTO getOrderByNumber(String number) {
        return OrderMapper.ORDER_MAPPER.toDTO(orderRepository.findByNumber(number));
    }
}
