package com.file.storage_master.service.storage;

import jakarta.annotation.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class S3StorageService implements StorageService {

    @Override
    public void store(MultipartFile file) {

    }

    @Override
    public Resource getFile(String key) { return null; }

    @Override
    public List<String> getFileNames() { return null; }
}
