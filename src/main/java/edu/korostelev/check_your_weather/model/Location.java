package edu.korostelev.check_your_weather.model;

import jakarta.persistence.*;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import java.math.BigDecimal;

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

    public Location() {

    }

    public Location(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
