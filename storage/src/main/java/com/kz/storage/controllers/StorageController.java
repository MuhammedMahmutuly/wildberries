package com.kz.storage.controllers;

import com.kz.storage.entity.dto.StorageDTO;
import com.kz.storage.services.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StorageController {
    @Autowired
    private StorageService storageService;

    @GetMapping("/getByNameStorage")
    public StorageDTO getByNameStorage(String name) {
        return storageService.getByNameStorage(name);
    }
}
