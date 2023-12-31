package com.kz.product.entityes.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

import java.util.UUID;

@Builder // строитель
@Setter
@Getter //ля геттер сеттер
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ProductDTO {
    private UUID id;
    private String name;
    private String model;
    private String type;
}
