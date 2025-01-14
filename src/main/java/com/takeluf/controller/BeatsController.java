package com.takeluf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeatsController {
    @GetMapping("/beats")
    public String beats() {
        return "beats";
    }
}
