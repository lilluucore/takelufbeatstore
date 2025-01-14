package com.takeluf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FaqsController {
    @GetMapping("/faqs")
    public String faqs() {
        return "faqs";
    }
}
