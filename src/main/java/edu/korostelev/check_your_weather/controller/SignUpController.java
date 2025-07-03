package edu.korostelev.check_your_weather.controller;

import edu.korostelev.check_your_weather.dto.user.SignUpRequestCredentials;
import edu.korostelev.check_your_weather.service.interfaces.RegistrationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sign-up")
public class SignUpController {
    private final RegistrationService registrationService;

    public SignUpController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping
    public String showSignUp(Model model) {
        model.addAttribute("signUpCredentials", new SignUpRequestCredentials());
        return "sign-up";
    }

    @PostMapping
    public String register(@ModelAttribute SignUpRequestCredentials signUpCredentials, Model model) {
        var registeredUser = registrationService.register(signUpCredentials);
        model.addAttribute("userDTO", registeredUser);
        return "redirect:/";
    }
}
