package com.example.core.service.impl;

import com.example.core.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final WebClient aIWebClient;

    @Override
    public Long imagePrediction(MultipartFile file) {
        return 5L;
    }

}
