package com.kz.delivery.entity.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class DeliveryDTO {
    private UUID id;
    private String address;
    private String orderNumber;
}
