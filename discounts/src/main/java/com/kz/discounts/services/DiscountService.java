package com.kz.discounts.services;

import com.kz.discounts.entityes.Discount;
import com.kz.discounts.entityes.dto.DiscountDTO;

import java.util.List;

public interface DiscountService {

    public List<DiscountDTO> getAllDiscounts();
}
