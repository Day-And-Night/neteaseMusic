package com.mapper;

import com.domain.LocalMusic;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface LocalMusicMapper {
    @Insert("insert into local_music values (#{id}, #{title}, #{singer}, #{album}, #{time_length}, #{language})")
    void save(LocalMusic localMusic);

    @Select("select * from local_music")
    List<LocalMusic> findAllMusic();

    @Select("select title from local_music")
    List<String> findAllMusicTitle();

    @Select("select distinct singer from local_music")
    List<String> findAllSinger();

    //根据歌手查询歌曲
    @Select("select * from local_music where singer=#{singer}")
    List<LocalMusic> findMusicBySinger(String singer);



}
