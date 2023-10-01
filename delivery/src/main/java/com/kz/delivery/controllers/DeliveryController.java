package com.kz.delivery.controllers;

import com.kz.delivery.entity.dto.DeliveryDTO;
import com.kz.delivery.services.DeliveryService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/getAllDelivery")
    public List<DeliveryDTO> getAllDelivery() {
        return deliveryService.getAllDelivery();
    }
}
