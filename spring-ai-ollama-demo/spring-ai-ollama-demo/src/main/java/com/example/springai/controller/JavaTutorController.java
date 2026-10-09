package com.example.springai.controller;

import com.example.springai.dto.TutorResponse;
import com.example.springai.service.JavaTutorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/tutor")
public class JavaTutorController {

    private final JavaTutorService javaTutorService;

    public JavaTutorController(JavaTutorService javaTutorService) {
        this.javaTutorService = javaTutorService;
    }

    @GetMapping("/explain")
    public TutorResponse explain(
            @RequestParam String topic) {

        if (topic == null || topic.isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Topic must not be blank"
            );
        }

        return javaTutorService.explainTopic(topic);
    }
}