////
////package com.example.springai.service;
////
////import org.springframework.ai.chat.client.ChatClient;
////import org.springframework.stereotype.Service;
////
////@Service
////public class JavaTutorService {
////
////    private final ChatClient chatClient;
////
////    public JavaTutorService(ChatClient.Builder builder) {
////        this.chatClient = builder.build();
////    }
////
////    public String explainTopic(String topic, String language) {
////
////        return chatClient
////                .prompt()
////                .system("""
////                    You are a friendly programming teacher.
////                    Explain concepts in simple English.
////                    Give one practical code example.
////                    Keep the explanation beginner-friendly.
////                    """)
////                .user(user -> user
////                        .text("""
////                            Explain the topic {topic}.
////                            Use {language} for the code example.
////                            Explain the code step by step.
////                            """)
////                        .param("topic", topic)
////                        .param("language", language))
////                .call()
////                .content();
////    }
////}
//
//package com.example.springai.service;
//
//import org.springframework.ai.chat.client.ChatClient;
//import org.springframework.stereotype.Service;
//
//@Service
//public class JavaTutorService {
//
//    private final ChatClient chatClient;
//
//    public JavaTutorService(ChatClient chatClient) {
//        this.chatClient = chatClient;
//    }
//
//    public String explainTopic(String topic, String language) {
//
//        return chatClient
//                .prompt()
//                .user(user -> user
//                        .text("""
//                            Explain the topic {topic}.
//                            Use {language} for the code example.
//                            Explain the code step by step.
//                            """)
//                        .param("topic", topic)
//                        .param("language", language))
//                .call()
//                .content();
//    }
//}

package com.example.springai.service;

import com.example.springai.dto.TutorResponse;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class JavaTutorService {

    private final ChatClient chatClient;

    public JavaTutorService(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public TutorResponse explainTopic(String topic) {

        return chatClient
                .prompt()
                .user(user -> user
                        .text("""
                            Explain the Java topic: {topic}.

                            Return these fields:
                            - topic
                            - difficulty
                            - answer
                            - codeExample

                            Keep the explanation beginner-friendly.
                            Provide a short, valid Java code example.
                            """)
                        .param("topic", topic))
                .call()
                .entity(TutorResponse.class);
    }
}