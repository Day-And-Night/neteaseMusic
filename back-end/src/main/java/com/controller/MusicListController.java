package com.controller;

import com.domain.MusicList;
import com.service.MusicListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

@RequestMapping(value = "musicList", produces = "application/json;charset=UTF-8")
public class MusicListController {
    @Autowired
    MusicListService musicListService;

    // 查询所有的歌单信息
    @RequestMapping(value = "findAllMusicList", method = RequestMethod.GET)
    @ResponseBody
    public List<MusicList> findAllMusicList() {
        return musicListService.findAllMusicList();
    }

    // 根据歌单id查询歌单信息
    @RequestMapping(value = "findListById", method = RequestMethod.GET)
    @ResponseBody
    public MusicList findListById(@RequestParam("id") String id) {
        return musicListService.findListById(id);
    }


}
