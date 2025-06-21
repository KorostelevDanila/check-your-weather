package edu.korostelev.check_your_weather.service;

import edu.korostelev.check_your_weather.dto.user.SignUpRequestCredentials;
import edu.korostelev.check_your_weather.dto.user.UserDTO;
import edu.korostelev.check_your_weather.model.User;
import edu.korostelev.check_your_weather.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class DatabaseRegistrationService implements RegistrationService {
    private final UserRepository userRepository;

    public DatabaseRegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO register(SignUpRequestCredentials credentials) {
        User recievedUser = new User(credentials.getLogin(), credentials.getPassword());
        User createdUser = userRepository.save(recievedUser);
        UserDTO userDTO = new UserDTO(createdUser.getId(), createdUser.getLogin());
        return userDTO;
    }
}
