package com.kz.discounts.mappers;

import com.kz.discounts.entityes.Discount;
import com.kz.discounts.entityes.dto.DiscountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface DiscountMapper {
    DiscountMapper DISCOUNT_MAPPER = Mappers.getMapper(DiscountMapper.class);

    Discount toEntity(DiscountDTO discountDTO); //метод создает Entity из DTO

    DiscountDTO toDTO(Discount entity);         //метод создает DTO из Entity

    List<DiscountDTO> toListDTO(List<Discount> entityList);  //метод создает DTOLIST из Entity
}
