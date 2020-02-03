package com.s2u2m.services.ac.auth.username;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login/username")
public class UsernameLoginEndpoint {

    @PostMapping("")
    public String index() {
        return "username";
    }

}
