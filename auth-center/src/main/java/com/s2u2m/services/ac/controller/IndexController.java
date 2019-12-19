package com.s2u2m.services.ac.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class IndexController {

    @GetMapping("/session")
    public String session(HttpServletRequest request, HttpSession session) {
        return session.getId();
    }

    @GetMapping("/{ping}")
    public String pingPong(@PathVariable("ping") String ping) {
        return ping;
    }

}
