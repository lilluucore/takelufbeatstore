package com.takeluf.controller;

import com.takeluf.model.ContactForm;
import com.takeluf.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contactus")
    public String contactus() {
        return "contactus";
    }

    @PostMapping("/submitContact")
    public String submitContact(@RequestParam String name, @RequestParam String surname,
                                @RequestParam String phone, @RequestParam String telegram, Model model) {
        if (name.isEmpty() || surname.isEmpty() || phone.isEmpty() || telegram.isEmpty()) {
            model.addAttribute("error", "All fields are required!");
            return "contactus";
        }
        ContactForm contactForm = new ContactForm(name, surname, phone, telegram);
        contactService.processContactForm(contactForm);
        model.addAttribute("message", "Your message has been sent successfully!");
        return "contactus";
    }
}
