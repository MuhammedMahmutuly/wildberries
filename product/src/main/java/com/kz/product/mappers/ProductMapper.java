package com.kz.product.mappers;

import com.kz.product.entityes.Product;
import com.kz.product.entityes.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper PRODUCT_MAPPER = Mappers.getMapper(ProductMapper.class);

    ProductDTO toDTO(Product entity);

    Product toEntity(ProductDTO productDTO);

    List<ProductDTO> toListDTO(List<Product> entityList);
}



//    public static ProductDTO toDTO(Product entity) {
//        return ProductDTO.builder()
//                .id(entity.getId())
//                .name(entity.getName())
//                .type(entity.getType())
//                .build();
//    }
//
//    public static Product toEntity(ProductDTO productDTO) {
//        return Product.builder()
//                .id(productDTO.getId())
//                .name(productDTO.getName())
//                .type(productDTO.getType())
//                .build();
//    }
//
//    public static List<ProductDTO> toListDTO(List<Product> entityList) { //метод создает ДТОЛИСТ из ентитилист
//        return entityList.stream()   //entitylist не келседе stream()- га берип тур
//                .map(e -> toDTO(e))  //map е ишине келгенди toDTO-га беремиз,
//                                     // сол кезде жогарыдагы метод шакырылады, toDTO(Order entity) жумысын жасайды (калай? - ол ентитидан дто жасайды)
//                .collect(Collectors.toList());   //toList()- ка айналдырып List<OrderDTO> кылып кайтарады
//    }
//}
