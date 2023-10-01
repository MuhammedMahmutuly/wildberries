package com.kz.product.services;

import com.kz.product.entityes.Product;
import com.kz.product.entityes.dto.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ServiceProduct {
    public List<ProductDTO> getAllProducts();

    public List<ProductDTO> getAllProductsByType(String productDTO);
}
