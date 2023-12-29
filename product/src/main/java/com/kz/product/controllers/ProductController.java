package com.kz.product.controllers;

import com.kz.product.entityes.dto.ProductDTO;
import com.kz.product.entityes.dto.ProductDTO2;
import com.kz.product.entityes.dto.ProductDTO3;
import com.kz.product.services.ServiceProduct;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Validated
@RestController
@AllArgsConstructor
@Tag(
        name = "Контроллер для продукта",
        description = "Описание продукта "
)
public class ProductController {

    @Autowired
    private ServiceProduct serviceProduct;

    @Operation(summary = "Метод получения",
            description = "Метод для получения всех продукт",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Успешный запрос"),
                    @ApiResponse(responseCode = "300",
                            description = "Описание ответа 300"),
                    @ApiResponse(responseCode = "400",
                            description = "Описание ответа 400"),
                    @ApiResponse(responseCode = "500",
                            description = "Описание ответа 500")
            })

    @GetMapping("/getAllProducts")
    public List<ProductDTO> getAllProducts() {
        return serviceProduct.getAllProducts();
    }

    @Operation(summary = "Метод добавления",
            description = "Метод для добавления продукта",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Успешный запрос"),
                    @ApiResponse(responseCode = "300",
                            description = "Описание ответа 300"),
                    @ApiResponse(responseCode = "400",
                            description = "Описание ответа 400"),
                    @ApiResponse(responseCode = "500",
                            description = "Описание ответа 500")
            })
    @PostMapping("addProduct")
    public void addProducts(@RequestBody @Valid ProductDTO productDTO ) {
        serviceProduct.addProducts(productDTO);
    }


    @Operation(summary = "Метод удаления",
            description = "Метод для удаления продукта по ID",
            responses = {
                    @ApiResponse(responseCode = "200",
                            description = "Успешно удален"),
                    @ApiResponse(responseCode = "300",
                            description = "Описание ответа 300"),
                    @ApiResponse(responseCode = "400",
                            description = "Описание ответа 400"),
                    @ApiResponse(responseCode = "500",
                            description = "Описание ответа 500")
            })
    @DeleteMapping("deleteProductById")
    public void deleteProducts(@RequestParam UUID id) {
        serviceProduct.deleteProducts(id);
    }

    @GetMapping("/getAllProductsByType")
    public List<ProductDTO> getAllProductsByType(@RequestParam String type) {
        return serviceProduct.getAllProductsByType(type);
    }

    @GetMapping("/getAllByName")
    public List<ProductDTO2> getAllByName(@RequestParam String type) {
        return serviceProduct.getAllByName(type);
    }

    @GetMapping("/getAllByTypeAndModel")
    public List<ProductDTO3> getAllByTypeAndModel(@RequestParam String name) {
        return serviceProduct.getAllByTypeAndModel(name);
    }

}
