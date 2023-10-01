package com.kz.orders.mappers;

import com.kz.orders.entityes.Order;
import com.kz.orders.entityes.dto.OrderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface OrderMapper {
    OrderMapper ORDER_MAPPER = Mappers.getMapper(OrderMapper.class);

    Order toEntity(OrderDTO orderDTO); //метод создает Entity из DTO

    OrderDTO toDTO(Order entity);        //метод создает DTO из Entity

    List<OrderDTO> toListDTO(List<Order> entityList);   //метод создает DTOLIST из Entity


}


                        // Егер без аннотации @MAPPER колданатын болсак осылай жазамыз

//    public static OrderDTO toDTO(Order entity) { //метод создает ДТО из ентити
//
//        return OrderDTO.builder()
//                .id(entity.getId())
//                .number(entity.getNumber())
//                .description(entity.getDescription())
//                .build();
//    }
//
//    public static Order toEntity(OrderDTO orderDTO) { //метод создает ЕНТИТИ из дто
//        return Order.builder()
//                .id(orderDTO.getId())
//                .number(orderDTO.getNumber())
//                .description(orderDTO.getDescription())
//                .build();
//    }
//
//    public static List<OrderDTO> toListDTO(List<Order> entitylist) { //метод создает ДТОЛИСТ из ентитилист
//        return entitylist.stream()   // entitylist не келседе stream()- га берип тур
//                .map(e -> toDTO(e))  //map е ишине келгенди toDTO-га беремиз,
//                                     // сол кезде жогарыдагы метод шакырылады, toDTO(Order entity) жумысын жасайды (калай? - ол ентитидан дто жасайды)
//                .collect(Collectors.toList()); //toList()- ка айналдырып List<OrderDTO> кылып кайтарады
//    }
//}

//         2 - вариант без builder
//        OrderDTO orderDTO = new OrderDTO();
//        orderDTO.setDescription(entity.getDescription());
//        orderDTO.setId(entity.getId());
//        orderDTO.setName(entity.getNumber());
//        return orderDTO;