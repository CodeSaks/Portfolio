package com.saksham.portfolio.controller;

import com.saksham.portfolio.model.ContactMessage;
import com.saksham.portfolio.repository.ContactRepository;
import com.saksham.portfolio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> submitContactForm(@RequestBody ContactMessage message) {
        contactRepository.save(message);
        emailService.sendEmailNotification(message);
        return ResponseEntity.ok("Message received!");
    }
}

