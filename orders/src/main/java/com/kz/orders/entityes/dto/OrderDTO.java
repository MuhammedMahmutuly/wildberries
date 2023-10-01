package com.kz.orders.entityes.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder // строитель
@Data    // для геттер сеттер
public class OrderDTO {
    private UUID id;
    private String number;
    private String description;
}
