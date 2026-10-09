package com.example.springai.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatClientConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder builder) {
        return builder
                .defaultSystem("""
                    You are an experienced Java interview coach.
                    Explain concepts in simple English.
                    Give accurate answers and valid Java examples.
                    Keep answers suitable for beginner developers.
                    """)
                .build();
    }
}