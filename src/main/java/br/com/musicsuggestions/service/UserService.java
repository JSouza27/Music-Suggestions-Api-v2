package br.com.musicsuggestions.service;

import br.com.musicsuggestions.models.PlaylistHistory;
import br.com.musicsuggestions.models.User;
import br.com.musicsuggestions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private final UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User newUser) {
    return userRepository.save(newUser);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
}
