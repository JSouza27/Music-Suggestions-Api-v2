package br.com.musicsuggestions.service;

import br.com.musicsuggestions.models.PlaylistHistory;
import br.com.musicsuggestions.models.User;
import br.com.musicsuggestions.repositories.PlaylistRepository;
import br.com.musicsuggestions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistHistoryService {

  private PlaylistRepository playlistRepository;
  private UserRepository userRepository;

  @Autowired
  public PlaylistHistoryService(PlaylistRepository playlistRepository, UserRepository userRepository) {
    this.playlistRepository = playlistRepository;
    this.userRepository = userRepository;
  }

  public PlaylistHistory savePlaylist(PlaylistHistory playlist, int userId) {
    User user = userRepository.findById(userId);
    playlist.setUser(user);
    return playlistRepository.save(playlist);
  }

  public List<PlaylistHistory> getPlaylistByUser(int userId) {
    return playlistRepository.findByPlaylist_UserId(userId);
  }
}
