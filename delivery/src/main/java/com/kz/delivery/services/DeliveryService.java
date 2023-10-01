package com.kz.delivery.services;

import com.kz.delivery.entity.dto.DeliveryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeliveryService {
    public List<DeliveryDTO> getAllDelivery();
}
