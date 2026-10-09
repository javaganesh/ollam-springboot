package com.example.springai.controller;

import com.example.springai.dto.InterviewResponse;
import com.example.springai.service.InterviewService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/interviews")
public class InterviewController {

    private final InterviewService interviewService;

    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping("/explain")
    public InterviewResponse explain(
            @RequestParam String topic) {

        if (topic == null || topic.isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Topic must not be blank"
            );
        }

        return interviewService.explainTopic(topic);
    }
}