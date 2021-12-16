package br.com.musicsuggestions.dto;

import br.com.musicsuggestions.models.PlaylistHistory;

public class PlaylistHistoryDTO {

  private String playlist;

  public PlaylistHistoryDTO() {
  }

  public PlaylistHistoryDTO(String playlist) {
    this.playlist = playlist;
  }

  public PlaylistHistory newPlaylist() {
    return new PlaylistHistory(playlist);
  }

  public String getPlaylist() {
    return playlist;
  }

  public void setPlaylist(String playlist) {
    this.playlist = playlist;
  }
}
