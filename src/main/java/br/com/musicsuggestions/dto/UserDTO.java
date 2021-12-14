package br.com.musicsuggestions.dto;

import br.com.musicsuggestions.models.User;

import javax.validation.constraints.NotBlank;

public class UserDTO {

  @NotBlank(message = "Nome não deve estar em branco.")
  private String firstName;

  @NotBlank(message = "Sobrenome não deve estar em branco.")
  private String lastName;

  @NotBlank(message = "Senha não deve estar em branco.")
  private String email;

  @NotBlank(message = "E-mail não deve estar em branco.")
  private String password;

  public UserDTO() {
  }

  public UserDTO(String firstName, String lastName, String email, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
  }

  public User newUser() {
    return new User(firstName, lastName, email, password);
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
