import Vue from 'vue'
import Router from 'vue-router'

//首页模块
import find from '@/views/find'
import favourite from '@/views/favourite'

//导航栏模块
import about from '@/views/about'
import update from '@/views/update'

//发现模块
import playlist from '@/views/find/playlist'
import playlist_music_list from '@/views/music_list'
import djradio from '@/views/find/djradio'
import artist from '@/views/find/artist'
import toplist from '@/views/find/toplist'
import new_album from '@/views/find/new'

//排行榜模块
import toplist_elevate from '@/views/find/toplist/elevate'
import toplist_new from '@/views/find/toplist/new'
import toplist_original from '@/views/find/toplist/original'
import toplist_hot from '@/views/find/toplist/hot'





Vue.use(Router)

export default new Router({
  mode: 'hash',
  base: __dirname,
  routes: [
    {
      path: '/',
      redirect: '/main/find',
      name: 'main',
    },
    {
      path: '/main/find',
      component: find,
    },
    {
      path: '/main/favourite',
      component: favourite,
    },
    {
      path: '/main/about',
      component: about,      
    },
    {
      path: '/main/update',
      component: update,      
    },
    {
      path: '/main/find/playlist',
      component: playlist,          
    },
    {
      path: '/main/find/playlist/playlist_music_list',
      component: playlist_music_list,          
    },    
    {
      path: '/main/find/djradio',
      component: djradio,          
    },
    {
      path: '/main/find/artist',
      component: artist,          
    },
    {
      path: '/main/find/toplist',
      redirect: '/main/find/toplist/elevate',
      component: toplist,          
    },
    {
      path: '/main/find/toplist/elevate',
      component: toplist_elevate,          
    },
    {
      path: '/main/find/toplist/new',
      component: toplist_new,          
    },
    {
      path: '/main/find/toplist/original',
      component: toplist_original,          
    },
    {
      path: '/main/find/toplist/hot',
      component: toplist_hot,          
    },


    {
      path: '/main/find/new',
      component: new_album,          
    },
  ]
})
