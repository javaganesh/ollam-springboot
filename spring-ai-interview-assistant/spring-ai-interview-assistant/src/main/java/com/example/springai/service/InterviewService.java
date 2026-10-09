package com.example.springai.service;

import com.example.springai.dto.InterviewResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class InterviewService {

    private final ChatClient chatClient;

    public InterviewService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public InterviewResponse explainTopic(String topic) {

        return chatClient
                .prompt()
                .user(user -> user
                        .text("""
                            Prepare an interview explanation for
                            the Java topic: {topic}.

                            Return the following fields:
                            topic, difficulty, answer, codeExample.

                            Use a difficulty of Beginner,
                            Intermediate, or Advanced.

                            Give a concise explanation and a
                            short, valid Java code example.
                            """)
                        .param("topic", topic))
                .call()
                .entity(InterviewResponse.class);
    }
}