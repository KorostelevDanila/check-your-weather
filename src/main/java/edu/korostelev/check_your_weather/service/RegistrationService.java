package edu.korostelev.check_your_weather.service;

import edu.korostelev.check_your_weather.dto.user.SignUpRequestCredentials;
import edu.korostelev.check_your_weather.dto.user.UserDTO;
import org.springframework.stereotype.Service;

public interface RegistrationService {
    UserDTO register(SignUpRequestCredentials credentials);
}
