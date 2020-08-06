package com.controller;

import com.domain.Music;
import com.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "music", produces = "application/json;charset=UTF-8")
public class MusicController {
    @Autowired
    MusicService musicService;

    //查询所有音乐信息
    @RequestMapping(value = "findAllMusic", method = RequestMethod.GET)
    @ResponseBody
    public List<Music> findAllMusic() {
        return musicService.findAllMusic();
    }

    //根据歌手查询音乐
    @RequestMapping(value = "findMusicBySinger", method = RequestMethod.GET)
    @ResponseBody
    public List<Music> findMusicBySinger(@RequestParam("singer") String singer) {
        return musicService.findMusicBySinger(singer);
    }

    //根据音乐id查询音乐信息
    @RequestMapping(value = "findMusicById", method = RequestMethod.GET)
    @ResponseBody
    public List<Music> findMusicById(@RequestParam("id") String id) {
        return musicService.findMusicById(id);
    }

    //根据音乐标题查询音乐信息
    @RequestMapping(value = "findMusicByName", method = RequestMethod.GET)
    @ResponseBody
    public List<Music> findMusicByName(@RequestParam("name") String name) {
        return musicService.findMusicByName(name);
    }
}
