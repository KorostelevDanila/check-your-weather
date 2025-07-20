package edu.korostelev.check_your_weather.dto.user;

import edu.korostelev.check_your_weather.model.Location;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private Integer id;
    private String login;
    private List<Location> locations;
}
