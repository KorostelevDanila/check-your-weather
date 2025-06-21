package edu.korostelev.check_your_weather.security;

import edu.korostelev.check_your_weather.model.User;
import edu.korostelev.check_your_weather.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckYourWeatherUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public CheckYourWeatherUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.getUserByLogin(username);
        if (user.isEmpty()) throw new UsernameNotFoundException("User details not found for user: " + username);
        return new SecurityProfile(user.get());
    }
}
