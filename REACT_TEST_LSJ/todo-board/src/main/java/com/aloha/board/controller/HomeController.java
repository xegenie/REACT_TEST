package com.aloha.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String Home() {
        return "redirect:/swagger-ui/index.html";
    }
    
}
