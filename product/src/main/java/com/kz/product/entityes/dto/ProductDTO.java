package com.kz.product.entityes.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.validation.constraints.NotNull;
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
    @NotNull(message = "Поле type не должен быть null")
    private String type;
}
