package com.kz.discounts.entityes.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class DiscountDTO {
    private UUID id;
    private String name;
    private String type;
}
