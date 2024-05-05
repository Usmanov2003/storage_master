package com.file.storage_master.service.storage;

import jakarta.annotation.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StorageService {

    void store(MultipartFile file);

    Resource getFile(String filename);

    List<String> getFileNames();
}
