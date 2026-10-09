package com.example.springai.dto;

public record TutorResponse(
        String topic,
        String difficulty,
        String answer,
        String codeExample
) {
}