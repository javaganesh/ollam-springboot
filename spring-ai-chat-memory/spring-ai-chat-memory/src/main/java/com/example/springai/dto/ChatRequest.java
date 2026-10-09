package com.example.springai.dto;

public record ChatRequest(
        String conversationId,
        String message
) {
}