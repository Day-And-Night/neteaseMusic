package com.controller;

import com.domain.LocalMusic;
import com.service.LocalMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
//有关music的接口，传回json格式数据
@RequestMapping(value = "localMusic", produces = "application/json;charset=UTF-8")
public class LocalMusicController {
    @Autowired
    LocalMusicService localMusicService;

    //新增歌曲
    @RequestMapping(value = "addMusic", method = RequestMethod.POST)
    @ResponseBody
    public void save(@RequestParam("title") String title, @RequestParam("singer") String singer, @RequestParam("album") String album, @RequestParam("time_length") String time_length, @RequestParam("language") String language) {
        LocalMusic localMusic = new LocalMusic();

        System.out.println(title);

        localMusic.setAlbum(album);
        localMusic.setLanguage(language);
        localMusic.setSinger(singer);
        localMusic.setTime_length(time_length);
        localMusic.setTitle(title);

        localMusicService.save(localMusic);
    }

    //查询所有歌曲
    @RequestMapping(value = "findAllMusic", method = RequestMethod.GET)
    @ResponseBody
    public List<LocalMusic> findAllMusic() {
        return localMusicService.findAllMusic();
    }

    //查询所有歌曲标题
    @RequestMapping(value = "findAllMusicTitle", method = RequestMethod.GET)
    @ResponseBody
    public List<String> findAllMusicTitle() {
        return localMusicService.findAllMusicTitle();
    }

    //查询所有的歌手
    @RequestMapping(value = "findAllSinger", method = RequestMethod.GET)
    @ResponseBody
    public List<String> findAllSinger() {
        return localMusicService.findAllSinger();
    }

    //根据歌手查询歌曲
    @RequestMapping(value = "findMusicBySinger", method = RequestMethod.GET)
    @ResponseBody
    public List<LocalMusic> findMusicBySinger(@RequestParam("singer") String singer) {
        return localMusicService.findMusicBySinger(singer);
    }




}
