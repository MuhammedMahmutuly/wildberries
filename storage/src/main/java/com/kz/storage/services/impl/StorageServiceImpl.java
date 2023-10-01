package com.kz.storage.services.impl;

import com.kz.storage.entity.dto.StorageDTO;
import com.kz.storage.mappers.StorageMapper;
import com.kz.storage.repository.StorageRepository;
import com.kz.storage.services.StorageService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageRepository storageRepository;
    @Override
    public StorageDTO getByNameStorage(String name) {
        return StorageMapper.STORAGE_MAPPER.toDTO(storageRepository.findByNameStorage(name));
    }
}
