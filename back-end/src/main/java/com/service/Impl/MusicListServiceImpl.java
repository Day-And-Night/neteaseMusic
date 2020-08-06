package com.service.Impl;

import com.domain.MusicList;
import com.mapper.MusicListMapper;
import com.service.MusicListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MusicListService")
public class MusicListServiceImpl implements MusicListService {
    @Autowired
    private MusicListMapper musicListMapper;

    @Override
    public List<MusicList> findAllMusicList() {
        return musicListMapper.findAllMusicList();
    }

    @Override
    public MusicList findListById(String id) {
        return musicListMapper.findListById(id);
    }
}
