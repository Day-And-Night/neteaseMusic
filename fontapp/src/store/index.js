import Vue from 'vue'; 
import Vuex from 'vuex';

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        current_music: '想见你想见你想见你',
        current_music_list: [],
        current_music_list_img_url: '@/assets/img/playlist1.jpg',
        local_music_list: ["1321"],
        online_music_url: '',
    },
  
    //mutations只能执行同步方法（devtools 不知道什么时候回调函数实际上被调用），不要去执行异步方法 通过 this.$store.commit 方法去调用  

    //在大多数情况下，载荷应该是一个对象(指music），这样可以包含多个字段并且记录的 mutation 会更易读：  

    //使用常量替代 mutation 事件类型在各种 Flux 实现中是很常见的模式。这样可以使 linter 之类的工具发挥作用，同时把这些常量放在单独的文件中可以让你的代码合作者对整个 app 包含的 mutation 一目了然：
    //用不用常量取决于你——在需要多人协作的大型项目中，这会很有帮助。但如果你不喜欢，你完全可以不这样做。

    mutations: {
        //修改当前音乐
        modify_music: (state, music) => {
            state.current_music = music;
        },    

        //修改当前音乐列表
        modify_music_list: (state, music_list) => {
        	state.current_music_list = music_list;
        },

        //修改本地音乐列表
        modify_local_music_list: (state, local_music_list) => {
            state.local_music_list = local_music_list;
        },       

        //修改音乐url
        modify_online_music_url: (state, online_music_url) => {
            state.online_music_url = online_music_url;
        },    
    },
})