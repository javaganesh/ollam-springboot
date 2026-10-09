/*
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
                    You are a friendly programming teacher.
                    Explain concepts in simple English.
                    Give a practical code example.
                    Explain the code step by step.
                    """)
                .build();
    }
}*/



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
                    You are a friendly Java programming teacher.
                    Explain concepts in simple English.
                    Give correct and useful examples.
                    """)
                .build();
    }
}
