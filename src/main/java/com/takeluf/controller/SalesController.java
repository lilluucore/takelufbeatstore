package com.takeluf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {
    @GetMapping("/sales")
    public String sales() {
        return "sales";
    }
}
