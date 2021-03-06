package br.com.musicsuggestions.models;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "playlist_history")
public class PlaylistHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String playlist;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  public PlaylistHistory() {
  }

  public PlaylistHistory(String playlist) {
    this.playlist = playlist;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPlaylist() {
    return playlist;
  }

  public void setPlaylist(String playlist) {
    this.playlist = playlist;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
