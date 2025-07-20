package edu.korostelev.check_your_weather.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Location {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public Location(String name, User user) {
        this.name = name;
        this.user = user;
    }
}
