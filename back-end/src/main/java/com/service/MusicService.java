package com.service;

import com.domain.Music;

import java.util.List;

public interface MusicService {
    List<Music> findAllMusic();

    List<Music> findMusicBySinger(String singer);

    List<Music> findMusicById(String id);

    List<Music> findMusicByName(String name);
}
