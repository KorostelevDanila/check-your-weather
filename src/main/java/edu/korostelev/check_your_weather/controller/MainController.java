package edu.korostelev.check_your_weather.controller;

import edu.korostelev.check_your_weather.dto.user.UserDTO;
import edu.korostelev.check_your_weather.exception.UserNotFoundException;
import edu.korostelev.check_your_weather.security.SecurityProfile;
import edu.korostelev.check_your_weather.service.impl.UserService;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String mainPage(@AuthenticationPrincipal SecurityProfile securityProfile,
                           Model model) {
        try {
            if (securityProfile != null) {
                Integer id = securityProfile.getId();
                UserDTO user = userService.getUserById(id);
                model.addAttribute("user", user);
            }
        } catch (UserNotFoundException exception) {
            return "redirect:/error";
        }
        return "index";
    }
}
