package com.kz.storage.entity.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Builder
@Data
public class StorageDTO {
        private UUID id;
        private String nameStorage;
        private String numberStorage;
}
