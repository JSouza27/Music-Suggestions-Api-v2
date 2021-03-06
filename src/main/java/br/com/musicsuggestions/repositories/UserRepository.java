package br.com.musicsuggestions.repositories;

import br.com.musicsuggestions.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
  List<User> findAll();
  Optional<User> findByEmail(String email);
  User findById(int id);
}
