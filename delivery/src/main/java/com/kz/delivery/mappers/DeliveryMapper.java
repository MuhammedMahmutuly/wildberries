package com.kz.delivery.mappers;

import com.kz.delivery.entity.Delivery;
import com.kz.delivery.entity.dto.DeliveryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper
public interface DeliveryMapper {

    DeliveryMapper DELIVERY_MAPPER = Mappers.getMapper( DeliveryMapper.class );

    Delivery toEntity(DeliveryDTO deliveryDTO);

    DeliveryDTO toDTO(Delivery entity);

    List<DeliveryDTO> toListDTO(List<Delivery> entityList);
}
