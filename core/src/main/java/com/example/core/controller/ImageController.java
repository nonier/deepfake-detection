package com.example.core.controller;

import com.example.core.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequiredArgsConstructor
@RequestMapping("/image")
public class ImageController {

    private final ImageService imageService;

    @PostMapping("/upload")
    public String processImage(Model model, @RequestParam("image") MultipartFile file) throws IOException {
        Long deepFakeProbability = imageService.imagePrediction(file);
        model.addAttribute("msg", "DeepfakeProbability: " + deepFakeProbability);
        return "index";
    }
}
