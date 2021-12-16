package br.com.musicsuggestions.service;

import br.com.musicsuggestions.dto.LoginDTO;
import br.com.musicsuggestions.exception.EmailNotFoundException;
import br.com.musicsuggestions.exception.InvalidLoginException;
import br.com.musicsuggestions.models.User;
import br.com.musicsuggestions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService {

  private UserRepository userRepository;

  @Autowired
  public UserAuthenticationService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User authenticate(LoginDTO infoLogin) {
    User user = userRepository.findByEmail(infoLogin.getEmail()).orElseThrow(() -> new EmailNotFoundException("Usuário não existe!"));

    if(infoLogin.getPassword().equals(user.getPassword())) {
      return user;
    } else {
      throw new InvalidLoginException("Usuário inválidos!");
    }
  }
}
