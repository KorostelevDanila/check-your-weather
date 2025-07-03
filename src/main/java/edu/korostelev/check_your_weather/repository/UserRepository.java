package edu.korostelev.check_your_weather.repository;

import edu.korostelev.check_your_weather.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public Optional<User> getUserByLogin(String login);
    public Optional<User> getUserById(Integer id);
}
