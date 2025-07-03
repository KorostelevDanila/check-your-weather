package edu.korostelev.check_your_weather.service.interfaces;

import edu.korostelev.check_your_weather.dto.user.SignUpRequestCredentials;
import edu.korostelev.check_your_weather.dto.user.UserDTO;

public interface RegistrationService {
    UserDTO register(SignUpRequestCredentials credentials);
}
