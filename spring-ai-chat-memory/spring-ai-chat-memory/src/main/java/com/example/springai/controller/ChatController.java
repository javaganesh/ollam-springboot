package com.example.springai.controller;

import com.example.springai.dto.ChatRequest;
import com.example.springai.dto.ChatResponse;
import com.example.springai.service.ChatService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private final ChatService chatService;

    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @PostMapping
    public ChatResponse chat(@RequestBody ChatRequest request) {

        if (request.conversationId() == null
                || request.conversationId().isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "conversationId must not be blank");
        }

        if (request.message() == null
                || request.message().isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "message must not be blank");
        }

        return chatService.chat(
                request.conversationId().trim(),
                request.message().trim());
    }
}