package com.file.storage_master.controller;

import com.file.storage_master.domain.MetaData;
import com.file.storage_master.service.metadata.MetaDataService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/file/meta-data")
public class MetaDataController {

    @Resource
    private MetaDataService metaDataService;

    Logger logger = LoggerFactory.getLogger(MetaDataController.class);

    @GetMapping
    public ResponseEntity<Collection<MetaData>> getMetaDataList() {
        logger.debug("MetaDataController : getMetaDataList()");
        return ResponseEntity.ok().body(metaDataService.getAll());
    }
}
