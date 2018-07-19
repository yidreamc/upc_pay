package com.example.payng.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {

    private final StorageService storageService;

    @Autowired
    public FileUploadService(StorageService storageService){
        this.storageService = storageService;
    }

    public String upload(MultipartFile file){
        String filename = System.currentTimeMillis() + ".xlsx";
        storageService.store(file,filename);
        return filename;
    }
}
