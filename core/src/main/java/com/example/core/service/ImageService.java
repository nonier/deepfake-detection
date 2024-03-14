package com.example.core.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    Long imagePrediction(MultipartFile file);
}