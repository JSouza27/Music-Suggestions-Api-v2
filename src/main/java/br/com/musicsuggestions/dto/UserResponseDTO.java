package br.com.musicsuggestions.dto;

import br.com.musicsuggestions.models.User;

public class UserResponseDTO {

  private int id;
  private String firstName;
  private String lastName;
  private String email;

  private UserResponseDTO(int id, String firstName, String lastName, String email) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  public static UserResponseDTO userResponseDTO(User user) {
    return new UserResponseDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail());
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }
}
