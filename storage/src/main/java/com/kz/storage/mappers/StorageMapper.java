package com.kz.storage.mappers;

import com.kz.storage.entity.Storage;
import com.kz.storage.entity.dto.StorageDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StorageMapper {
    StorageMapper STORAGE_MAPPER = Mappers.getMapper(StorageMapper.class);

    StorageDTO toDTO(Storage entity);

    Storage toEntity(StorageDTO storageDTO);
}
