package com.magenic.amielspring.controllers;

import com.magenic.amielspring.domain.Message;
import com.magenic.amielspring.domain.MessageBuilder;
import com.magenic.amielspring.services.MessageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 */
@RestController
public class MessageController {

    // private static final Logger LOG =
    // LoggerFactory.getLogger(MessageController.class);

    private MessageService service;

    MessageController(MessageService messageService) {
        this.service = messageService;
    }

    @GetMapping("/api/message")
    public Message getMessage() {
        return this.service.getMessage();
    }
}