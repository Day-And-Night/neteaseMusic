<template>
	<div>
		<audio controls="controls" :src="current_music_url" type="audio/ogg" 
		:autoplay="isAutoplay" 
		@ended="toNextMusic">
			您的浏览器不支持 audio 标签。
		</audio>
		<div @click="toPreMusic" class="pre">上一首歌</div>	
		<div @click="toNextMusic" class="next">下一首歌</div>
	</div>
</template>

<script>
    import axios from 'axios'

	//在应用到vue中后的使用如下：比如在使用onplay时，要去掉on，用@play，在methods中定义方法执行体
    export default {
  	    name: 'Footer',
        data() {
            return {
      	        isAutoplay: false,
            };
        },
        methods: {
    	    //播放下一首歌曲
    	    toNextMusic () {
        		let current_music_list = this.$store.state.current_music_list;
        		let current_music = this.$store.state.current_music;

                //将对象转化为数组
                let current_music_arr = [];

                for (let i in current_music_list) {
                    current_music_arr.push(current_music_list[i]);
                }

                //新的当前音乐序号
        		let new_music_index = current_music_arr.indexOf(current_music) + 1

        		//循环播放安排上了
        		if (new_music_index === current_music_arr.length) {
        			new_music_index = 0;
        		}

        		let new_music = current_music_arr[new_music_index];

        		this.$store.commit('modify_music', new_music);
    	    },
        	//播放上一首歌曲
        	toPreMusic () {
        		let current_music_list = this.$store.state.current_music_list;
        		let current_music = this.$store.state.current_music;

                //将对象转化为数组
                let current_music_arr = [];

                for (let i in current_music_list) {
                    current_music_arr.push(current_music_list[i]);
                }

                //新的当前音乐序号
        		let new_music_index = current_music_arr.indexOf(current_music) - 1

        		//循环播放安排上了
        		if (new_music_index === -1) {
        			new_music_index = current_music_arr.length - 1;
        		}

        		let new_music = current_music_arr[new_music_index];

        		this.$store.commit('modify_music', new_music);
            }
        },
        
        created() {
            //获取并更新音乐列表
            let url = 'http://localhost:8080/localMusic/findAllMusicTitle';

            axios({
                method: 'get',
                url: url,
            }).then(res => {
                let music_list = res.data;
                this.$store.commit('modify_music_list', music_list);
                this.$store.commit('modify_local_music_list', music_list);
            })
        },

        computed: {
        	//获取当前歌曲url,并加入自动播放功能
        	current_music_url: function () {
        		this.isAutoplay = true;
                //如果当前歌曲在本地歌单里，则直接在本地文件夹找url;如果不在找store中的url
                if(this.$store.state.local_music_list.includes(this.$store.state.current_music)) {
                    return require(`@/assets/music/${this.$store.state.current_music}.ogg`);
                } else {
                    let url = this.$store.state.online_music_url;
                    if(url != '') {
                        return url;
                    } else {
                        return null;
                    }
                }


        		
        	},
        }
    }

</script>

<style scoped>
	audio {
		width: 100%;
	}

	.pre {
		position: fixed;
		top: 280px;
		left: 40px;
		cursor: pointer;
	}

	.next {
		position: fixed;
		top: 320px;
		left: 40px;
		cursor: pointer;
	}
</style>