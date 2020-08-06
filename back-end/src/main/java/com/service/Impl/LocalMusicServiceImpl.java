package com.service.Impl;

import com.domain.LocalMusic;
import com.mapper.LocalMusicMapper;
import com.service.LocalMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("LocalMusicService")
public class LocalMusicServiceImpl implements LocalMusicService {
    @Autowired
    private LocalMusicMapper localMusicMapper;

    @Override
    public void save(LocalMusic localMusic) {
        localMusicMapper.save(localMusic);
    }

    @Override
    public List<LocalMusic> findAllMusic() {
        return localMusicMapper.findAllMusic();
    }

    @Override
    public List<String> findAllMusicTitle() {
        return localMusicMapper.findAllMusicTitle();
    }

    @Override
    public List<String> findAllSinger() {
        return localMusicMapper.findAllSinger();
    }

    //根据歌手查询歌曲
    @Override
    public List<LocalMusic> findMusicBySinger(String singer) {
        return localMusicMapper.findMusicBySinger(singer);
    }


}
