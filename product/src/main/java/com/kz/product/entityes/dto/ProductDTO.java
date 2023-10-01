package com.kz.product.entityes.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder // строитель
@Data //ля геттер сеттер
public class ProductDTO {
    private UUID id;
    private String name;
    private String type;
}
