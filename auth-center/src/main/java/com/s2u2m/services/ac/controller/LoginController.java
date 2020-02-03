package com.s2u2m.services.ac.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {



    @PostMapping("/phone")
    public String phone() {
        return "phone";
    }
}
