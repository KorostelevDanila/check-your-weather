package edu.korostelev.check_your_weather.service.impl;

import edu.korostelev.check_your_weather.dto.user.UserDTO;
import edu.korostelev.check_your_weather.exception.UserNotFoundException;
import edu.korostelev.check_your_weather.model.User;
import edu.korostelev.check_your_weather.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO getUserById(Integer id) throws UserNotFoundException {
            Optional<User> user = userRepository.getUserById(id);
            Integer userId = user.orElseThrow(() -> new UserNotFoundException("No such user exists in repository")).getId();
            String userLogin = user.orElseThrow(() -> new UserNotFoundException("No such user exists in repository")).getLogin();
            return new UserDTO(userId, userLogin);
    }
}
