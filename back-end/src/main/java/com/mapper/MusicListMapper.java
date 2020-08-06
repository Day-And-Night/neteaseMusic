package com.mapper;

import com.domain.MusicList;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MusicListMapper {

    // 查询所有的歌单信息
    @Select("select * from music_list")
    List<MusicList> findAllMusicList();

    // 根据歌单id查询歌单信息
    @Select("select * from music_list where id=#{id}")
    MusicList findListById(String id);
}
