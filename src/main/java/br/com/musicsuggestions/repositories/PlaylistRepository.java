package br.com.musicsuggestions.repositories;

import br.com.musicsuggestions.models.PlaylistHistory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PlaylistRepository extends CrudRepository<PlaylistHistory, Integer> {
  List<PlaylistHistory> findAll();
  List<PlaylistHistory> findByPlaylist_UserId(int userId);
}
