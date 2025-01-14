package com.takeluf.service;

import com.takeluf.model.ContactForm;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    public void processContactForm(ContactForm contactForm) {
        // Логика обработки формы, например, отправка email
        System.out.println("Processing contact form: " + contactForm);
    }
}
