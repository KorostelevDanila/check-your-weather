package edu.korostelev.check_your_weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {
    @GetMapping
    public String showSignUp() {
        return "sign-up";
    }
}
