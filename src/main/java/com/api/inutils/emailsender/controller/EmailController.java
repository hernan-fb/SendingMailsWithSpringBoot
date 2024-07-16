package com.api.inutils.emailsender.controller;

import com.api.inutils.emailsender.controller.doc.EmailDoc;
import com.api.inutils.emailsender.entity.EmailDetails;
import com.api.inutils.emailsender.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EmailController implements EmailDoc {
    private final EmailService emailService;

    public ResponseEntity<String> sendMail(@RequestBody EmailDetails details) {
        return emailService.sendSimpleMail(details);
    }

    public ResponseEntity<String> sendMailWithAttachment(@RequestBody EmailDetails details) {
        return emailService.sendMailWithAttachment(details);
    }
}