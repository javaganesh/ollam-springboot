package com.example.springai.dto;

public record ErrorResponse(
        int status,
        String message
) {
}