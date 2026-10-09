/////*
////
////package com.example.springai.controller;
////
////import com.example.springai.service.JavaTutorService;
////import org.springframework.web.bind.annotation.*;
////
////@RestController
////@RequestMapping("/api/tutor")
////public class ChatController {
////
////    private final JavaTutorService javaTutorService;
////
////    public ChatController(JavaTutorService javaTutorService) {
////        this.javaTutorService = javaTutorService;
////    }
////
////    @GetMapping("/explain")
////    public String explain(
////            @RequestParam String topic,
////            @RequestParam(defaultValue = "Java") String language) {
////
////        if (topic.isBlank() || language.isBlank()) {
////            throw new IllegalArgumentException(
////                    "Topic and language must not be blank");
////        }
////
////        return javaTutorService.explainTopic(topic, language);
////    }
////}
////*/
//
//
//package com.example.springai.controller;
//
//import com.example.springai.service.JavaTutorService;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.server.ResponseStatusException;
//
//@RestController
//@RequestMapping("/api/tutor")
//public class ChatController {
//
//    private final JavaTutorService javaTutorService;
//
//    public ChatController(JavaTutorService javaTutorService) {
//        this.javaTutorService = javaTutorService;
//    }
//
//    @GetMapping("/explain")
//    public String explain(
//            @RequestParam String topic,
//            @RequestParam(defaultValue = "Java") String language) {
//
//        if (topic.isBlank() || language.isBlank()) {
//            throw new ResponseStatusException(
//                    HttpStatus.BAD_REQUEST,
//                    "Topic and language must not be blank."
//            );
//        }
//
//        return javaTutorService.explainTopic(topic, language);
//    }
//}


