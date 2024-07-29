package com.example.song.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.song.model.Song;
import com.example.song.service.SongH2Service;

@RestController
public class SongController {
   @Autowired
   public SongH2Service apiService;

   @GetMapping("/songs")
   public ArrayList<Song> getSongs() {
      return apiService.getSongs();
   }

   @PostMapping("/songs")
   public Song addSong(@RequestBody Song song) {
      return apiService.addSong(song);
   }

   @GetMapping("songs/{songId}")
   public Song getSongById(@PathVariable("songId") int songId) {
      return apiService.getSongById(songId);
   }

   @PutMapping("songs/{songId}")
   public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song) {
      return apiService.updateSong(songId, song);
   }

   @DeleteMapping("songs/{songId}")
   public void deleteSong(@PathVariable("songId") int songId) {
      apiService.deleteSong(songId);
   }

}