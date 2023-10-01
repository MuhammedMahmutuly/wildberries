package com.kz.storage.services;

import com.kz.storage.entity.dto.StorageDTO;

public interface StorageService {
    public StorageDTO getByNameStorage(String name);
}
