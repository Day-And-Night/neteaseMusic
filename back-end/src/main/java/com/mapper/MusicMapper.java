package com.mapper;

import com.domain.Music;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MusicMapper {
    //查询所有音乐信息
    @Select("select * from music")
    List<Music> findAllMusic();

    //根据歌手查询音乐
    @Select("select * from music where singer=#{singer}")
    List<Music> findMusicBySinger(String singer);

    //根据音乐id查询音乐信息
    @Select("select * from music where id=#{id}")
    List<Music> findMusicById(String id);

    //根据音乐标题查询音乐信息
    @Select("select * from music where name=#{name}")
    List<Music> findMusicByName(String name);


}
