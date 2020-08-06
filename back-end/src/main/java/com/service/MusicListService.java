package com.service;

import com.domain.MusicList;

import java.util.List;

public interface MusicListService {
    List<MusicList> findAllMusicList();

    MusicList findListById(String id);
}
