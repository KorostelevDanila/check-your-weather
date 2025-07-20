package edu.korostelev.check_your_weather.service.auth.impl;

import edu.korostelev.check_your_weather.dto.user.UserDTO;
import edu.korostelev.check_your_weather.exception.UserNotFoundException;
import edu.korostelev.check_your_weather.model.Location;
import edu.korostelev.check_your_weather.model.User;
import edu.korostelev.check_your_weather.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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
            List<Location> userLocations = user.orElseThrow(() -> new UserNotFoundException("No such user exists in repository")).getLocations();
            return new UserDTO(userId, userLogin, userLocations);
    }
}
