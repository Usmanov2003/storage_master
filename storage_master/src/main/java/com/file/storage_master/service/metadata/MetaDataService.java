package com.file.storage_master.service.metadata;

import com.file.storage_master.domain.MetaData;

import java.util.List;

public interface MetaDataService {
    public MetaData get(String fileName);
    public List<MetaData> getAll();
    public void store(MetaData metaData);
}
