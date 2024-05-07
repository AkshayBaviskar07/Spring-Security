package com.embarkX.Security1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/message")
    public String message() {
        return "Hello welcome Spring Security Tutorial";
    }
}
