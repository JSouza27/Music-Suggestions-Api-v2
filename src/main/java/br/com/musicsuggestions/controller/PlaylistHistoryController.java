package br.com.musicsuggestions.controller;

import br.com.musicsuggestions.dto.PlaylistHistoryDTO;
import br.com.musicsuggestions.models.PlaylistHistory;
import br.com.musicsuggestions.service.PlaylistHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v2")
public class PlaylistHistoryController {

  private PlaylistHistoryService playlistHistoryService;

  @Autowired
  public PlaylistHistoryController(PlaylistHistoryService playlistHistoryService) {
    this.playlistHistoryService = playlistHistoryService;
  }

  @PostMapping("/playlist/{userId}")
  public ResponseEntity<String> savePlaylist(@PathVariable(value = "userId") int userId, @RequestBody PlaylistHistoryDTO playlist) {
    PlaylistHistory newPlaylist = playlistHistoryService.savePlaylist(playlist.newPlaylist(), userId);
    return new ResponseEntity<String>(newPlaylist.getPlaylist(), HttpStatus.CREATED);
  }

  @GetMapping("/playlist/{userId}")
  public List getPlaylistByUser(@PathVariable(value = "userId") int userId) {
    return playlistHistoryService.getPlaylistByUser(userId);
  }
}
