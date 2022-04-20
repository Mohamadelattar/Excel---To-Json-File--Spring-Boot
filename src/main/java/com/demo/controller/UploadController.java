package com.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.demo.service.UploadService;

@RestController
public class UploadController {

    private final  UploadService uploadService;

    public UploadController(UploadService uploadService) {
        this.uploadService = uploadService;
    }

    @PostMapping("/upload")
    public List<Map<String, String>> upload(@RequestParam("file") MultipartFile file) throws IOException {
        return uploadService.upload(file);
    }
}
