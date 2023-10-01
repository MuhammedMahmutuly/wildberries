package com.kz.discounts.controllers;

import com.kz.discounts.entityes.dto.DiscountDTO;
import com.kz.discounts.services.DiscountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @GetMapping("/getAllDiscounts")
    public List<DiscountDTO> getAllDiscounts() {
        return discountService.getAllDiscounts();
    }
}
