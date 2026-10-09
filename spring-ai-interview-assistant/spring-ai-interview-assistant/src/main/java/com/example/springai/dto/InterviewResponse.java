package com.example.springai.dto;

public record InterviewResponse(
        String topic,
        String difficulty,
        String answer,
        String codeExample
) {
}