package br.com.musicsuggestions.dto;

import br.com.musicsuggestions.models.User;

import javax.validation.constraints.NotBlank;

public class UserLoginDTO {

  @NotBlank(message = "O campor email não pode estar vazio")
  private String email;

  @NotBlank(message = "O campor senha não pode estar vazio")
  private String passwrod;

  public UserLoginDTO() {
  }

  public UserLoginDTO(String email, String passwrod) {
    this.email = email;
    this.passwrod = passwrod;
  }

  public static UserLoginDTO userLoginDTO(User user) {
    return new UserLoginDTO(user.getEmail(), user.getPassword());
  }

  public String getEmail() {
    return email;
  }

  public String getPasswrod() {
    return passwrod;
  }
}
