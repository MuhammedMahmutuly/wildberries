package com.kz.product.services.impl;

import com.kz.product.entityes.dto.ProductDTO;
import com.kz.product.mappers.ProductMapper;
import com.kz.product.repositoryes.ProductRepository;
import com.kz.product.services.ServiceProduct;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceProductImpl implements ServiceProduct {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        return ProductMapper.PRODUCT_MAPPER.toListDTO(productRepository.findAll());

    }

    @Override
    public List<ProductDTO> getAllProductsByType(String type) {
        return ProductMapper.PRODUCT_MAPPER.toListDTO(productRepository.findAllByType(type));
    }
}
