package edu.korostelev.check_your_weather.controller;

import edu.korostelev.check_your_weather.security.SecurityProfile;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    @GetMapping
    public String mainPage(@AuthenticationPrincipal SecurityProfile profile,
                           Model model) {
        model.addAttribute("user", profile);
        return "index";
    }
}
