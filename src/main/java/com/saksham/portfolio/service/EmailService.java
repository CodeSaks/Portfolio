package com.saksham.portfolio.service;

import com.saksham.portfolio.model.ContactMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public void sendEmailNotification(ContactMessage message) {
        // Logic to send email using AWS SES (Simple Email Service)
        System.out.println("Sending email to admin: " + message.getEmail());
    }
}

