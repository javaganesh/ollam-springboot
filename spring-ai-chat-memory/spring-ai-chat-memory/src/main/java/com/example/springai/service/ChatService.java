package com.example.springai.service;

import com.example.springai.dto.ChatResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public ChatResponse chat(
            String conversationId,
            String message) {

        String reply = chatClient
                .prompt()
                .user(message)
                .advisors(advisor -> advisor.param(
                        ChatMemory.CONVERSATION_ID,
                        conversationId))
                .call()
                .content();

        return new ChatResponse(conversationId, reply);
    }
}