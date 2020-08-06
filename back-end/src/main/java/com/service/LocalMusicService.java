package com.service;

import com.domain.LocalMusic;

import java.util.List;

public interface LocalMusicService {
    public void save(LocalMusic localMusic);

    public List<LocalMusic> findAllMusic();

    public List<String> findAllMusicTitle();

    public List<String> findAllSinger();

    //根据歌手查询歌曲
    public List<LocalMusic> findMusicBySinger(String singer);

}
