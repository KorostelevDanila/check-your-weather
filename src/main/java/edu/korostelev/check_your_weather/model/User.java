package edu.korostelev.check_your_weather.model;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
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

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
