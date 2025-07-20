package edu.korostelev.check_your_weather.security;

import edu.korostelev.check_your_weather.model.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Getter
public class SecurityProfile implements UserDetails {
    private final Integer id;
    private final String username;
    private final String password;
    private List<GrantedAuthority> authorities;

    public SecurityProfile(User user) {
        this.id = user.getId();
        this.username = user.getLogin();
        this.password = user.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("user"));
    }
}
