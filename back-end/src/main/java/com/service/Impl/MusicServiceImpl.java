package com.service.Impl;

import com.domain.Music;
import com.mapper.MusicMapper;
import com.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MusicService")
public class MusicServiceImpl implements MusicService {
    @Autowired
    MusicMapper musicMapper;

    @Override
    public List<Music> findAllMusic() {
        return musicMapper.findAllMusic();
    }

    @Override
    public List<Music> findMusicBySinger(String singer) {
        return musicMapper.findMusicBySinger(singer);
    }

    @Override
    public List<Music> findMusicById(String id) {
        return musicMapper.findMusicById(id);
    }

    @Override
    public List<Music> findMusicByName(String name) {
        return musicMapper.findMusicByName(name);
    }
}
