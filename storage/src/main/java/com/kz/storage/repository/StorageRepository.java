package com.kz.storage.repository;

import com.kz.storage.entity.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StorageRepository extends JpaRepository<Storage, UUID> {
    public Storage findByNameStorage(String name);
}
