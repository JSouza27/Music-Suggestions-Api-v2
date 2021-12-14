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
  @JoinColumn(name = "id_user")
  private User user;

  @CreatedDate
  @Column(name = "create_at")
  private Date createAt;

  public PlaylistHistory() {
  }

  public PlaylistHistory(String playlist, User user) {
    this.playlist = playlist;
    this.user = user;
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

  public Date getCreateAt() {
    return createAt;
  }

  public void setCreateAt(Date createAt) {
    this.createAt = createAt;
  }
}
