package edu.korostelev.check_your_weather.dto.user;

import edu.korostelev.check_your_weather.model.Location;

import java.util.List;

public class UserDTO {
    private Integer id;
    private String login;
    private List<Location> locations;

    public UserDTO(Integer id, String login, List<Location> locations) {
        this.id = id;
        this.login = login;
        this.locations = locations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
