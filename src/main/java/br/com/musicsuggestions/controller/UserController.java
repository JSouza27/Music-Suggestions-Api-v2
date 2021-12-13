package br.com.musicsuggestions.controller;

import br.com.musicsuggestions.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/users")
public class UserController {

  @GetMapping("/")
  public User getUser() {
    return new User(1l, "Iara", "da Guia Ramos", "test@test.com", "123456");
  }
}
