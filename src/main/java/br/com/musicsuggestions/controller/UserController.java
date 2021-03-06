package br.com.musicsuggestions.controller;

import br.com.musicsuggestions.dto.*;
import br.com.musicsuggestions.models.PlaylistHistory;
import br.com.musicsuggestions.models.User;
import br.com.musicsuggestions.service.UserAuthenticationService;
import br.com.musicsuggestions.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v2")
public class UserController {

  private UserService userService;
  private UserAuthenticationService userAuthenticationService;

  @Autowired
  public UserController(UserService userService, UserAuthenticationService userAuthenticationService) {
    this.userService = userService;
    this.userAuthenticationService = userAuthenticationService;
  }

  @GetMapping("/list")
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @PostMapping("/register")
  public ResponseEntity<UserResponseDTO> createUser(@RequestBody @Valid UserDTO userDTO) {
    User newUser = userService.createUser(userDTO.newUser());
    return new ResponseEntity<>(UserResponseDTO.userResponseDTO(newUser), HttpStatus.CREATED);
  }

  @PostMapping("/login")
  public ResponseEntity<UserLoginDTO> login(@RequestBody @Valid LoginDTO infoLogin) {
    User user = userAuthenticationService.authenticate(infoLogin);
    return new ResponseEntity<>(UserLoginDTO.userLoginDTO(user), HttpStatus.OK);
  }
}
