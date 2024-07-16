package com.api.inutils.emailsender.service;

import com.api.inutils.emailsender.entity.EmailDetails;
import org.springframework.http.ResponseEntity;

public interface EmailService {
    ResponseEntity<String> sendSimpleMail(EmailDetails details);
    ResponseEntity<String> sendMailWithAttachment(EmailDetails details);
}
