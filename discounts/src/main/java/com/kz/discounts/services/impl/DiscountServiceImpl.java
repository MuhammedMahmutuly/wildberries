package com.kz.discounts.services.impl;

import com.kz.discounts.entityes.Discount;
import com.kz.discounts.entityes.dto.DiscountDTO;
import com.kz.discounts.mappers.DiscountMapper;
import com.kz.discounts.repository.DiscountRepository;
import com.kz.discounts.services.DiscountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DiscountServiceImpl implements DiscountService {
    private DiscountRepository discountRepository;
    @Override
    public List<DiscountDTO> getAllDiscounts() {
        return DiscountMapper.DISCOUNT_MAPPER.toListDTO(discountRepository.findAll());
    }
}
