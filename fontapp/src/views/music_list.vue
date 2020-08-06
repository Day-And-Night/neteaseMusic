<template>
	<div class="music_list">
		<div class="music_list_head">
			<div class="music_list_head_title">
				<div class="coverlist_img">
					<a href="/#/main/find/playlist/playlist_music_list"><img :src="music_list.coverImgUrl"></a>
				</div>
				<div class="headline">
					{{ music_list.name }}
				</div>
				<div class="breif_introduce">
					简介：{{ music_list.description }}
				</div>
			</div>
		</div>
		<div class="spilt"></div>		
		<div class="music_list_content">
		  <el-table
		    :data="songs"
		    stripe
		    style="width: 100%"
		    @row-dblclick="changeMusic">
		    <el-table-column
		      type="index"
		      width="50">
		    </el-table-column>
		    <el-table-column
		      prop="name"
		      label="音乐标题"
		      width="280">
		    </el-table-column>
		    <el-table-column
		      prop="singer"
		      label="歌手"
		      width="200">
		    </el-table-column>
		    <el-table-column
		      prop="album"
		      label="专辑"
		      width="450">
		    </el-table-column>
		    <el-table-column
		      prop="time_length"
		      label="时长">
		    </el-table-column>
		  </el-table>			
		</div>
	</div>
</template>

<script>
	import axios from 'axios'

    export default {
	    data() {
	        return {
		        id: 0,
		        music_list: {},
		        songs: [],
		        music_list_name: [],
	        }
	    },

	    computed: {
	    	songsNum: function () {
	    		return this.tableData.length;
	    	},

	    	url: function () {
	    		return require(`@/assets/img/recommend1.jpg`);
	    	},
	    },

	    methods: {
	    	changeMusic (row) {
	    		this.$store.commit('modify_music', row.name);
	    		this.$store.commit('modify_music_list', this.music_list_name);
	    		this.$store.commit('modify_online_music_url', row.url);
	    	},
	    },

	    created() {
	    	this.id = this.$route.query.id;

	        //根据歌单id获得歌单信息
	        let url = 'http://localhost:8080/musicList/findListById?id=' + this.id;

	        axios({
	            method: 'get',
	            url: url,
	        }).then(res => {
	            this.music_list = res.data;

	            let trackIds = this.music_list.trackIds;
	            trackIds = trackIds.slice(1,-1).split(",");

	           	for(let i=0; i<trackIds.length; i++) {
	        		let url = 'http://localhost:8080/music/findMusicById?id=' + trackIds[i];

			        axios({
			            method: 'get',
			            url: url,
			        }).then(res => {
			        	let song = res.data[0];

			        	// 时间格式转换
			        	let minute = parseInt(song['time_length'] / 1000 / 60);
			        	if(minute < 10) {
			        		minute = "0" + minute;
			        	}
			        	let second = parseInt(song['time_length'] / 1000 % 60);
			        	if(second < 10) {
			        		second = "0" + second;
			        	}
			        	song['time_length'] = minute + ":" + second;

			        	this.songs.push(song);

						this.music_list_name.push(song['name']);
			        })
	        	}
	        })
	    }

    }	
</script>

<style scoped>
	.music_list_head {
		height: 250px;
		background-color: white;
		padding-left: 10px;
		overflow: hidden;
	}

	.music_list_head .music_list_head_title .coverlist_img {
		float: left;
	}

	.music_list_head .music_list_head_title .coverlist_img img {
		position: relative;
		height: 200px;
		width: 200px;
	}

	.music_list_head .music_list_head_title .headline {
		text-align: left;
		padding-left: 20px;
		float: left;
		font-size: 30px;
		width: 900px;
	}

	.music_list_head .music_list_head_title .breif_introduce {
		text-align: left;
		line-height: 24px;
		display: block;
		word-wrap:break-word;
		padding-left: 20px;
		float: left;
		font-size: 15px;
		width: 900px;
	}

    .music_list_head_title {
    	display: inline-block;
    	font-size: 21px;
    	float: left;
    	line-height: 63px;
    }

     .music_list_head_count {
    	display: inline-block;
    	font-size: 14px;
    	float: left;
    	line-height: 69px;
    	margin-left: 10px;
    }

 	.spilt {
 		border-top: 1px solid #c62f2f;
 	}


</style>