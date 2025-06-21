package edu.korostelev.check_your_weather.model;

import jakarta.persistence.*;

import edu.korostelev.check_your_weather.model.Location;
import java.util.List;

@Entity
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "user_id_seq"
    )
    @SequenceGenerator(
            name = "user_id_seq",
            sequenceName = "user_id_seq",
            allocationSize = 1
    )
    private Integer id;

    @Column(
            unique = true
    )
    private String login;

    private String password;

    @OneToMany(mappedBy="user")
    private List<Location> locations;

    public User() {

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

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
