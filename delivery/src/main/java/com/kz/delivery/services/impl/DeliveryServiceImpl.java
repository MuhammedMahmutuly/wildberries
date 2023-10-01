package com.kz.delivery.services.impl;

import com.kz.delivery.entity.dto.DeliveryDTO;
import com.kz.delivery.mappers.DeliveryMapper;
import com.kz.delivery.repository.DeliveryRepository;
import com.kz.delivery.services.DeliveryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DeliveryServiceImpl  implements DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Override
    public List<DeliveryDTO> getAllDelivery() {
        return DeliveryMapper.DELIVERY_MAPPER.toListDTO(deliveryRepository.findAll());
    }
}
