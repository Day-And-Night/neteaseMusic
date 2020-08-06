<template>
	<div class="favourite">
		<div class="favourite_head">
			<div class="favourite_head_title">
				我最爱的音乐
			</div>
			<div class="favourite_head_count">
				{{ songsNum }}首音乐
			</div>
		</div>
		<div class="spilt"></div>		
		<div class="favourite_content">
		  <el-table
		    :data="music_list"
		    stripe
		    style="width: 100%"
		    @row-dblclick="changeMusic">
		    <el-table-column
		      prop="id"
		      label="序号"
		      width="50">
		    </el-table-column>
		    <el-table-column
		      prop="title"
		      label="音乐标题"
		      width="300">
		    </el-table-column>
		    <el-table-column
		      prop="singer"
		      label="歌手"
		      width="250">
		    </el-table-column>
		    <el-table-column
		      prop="album"
		      label="专辑">
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
	        	music_list: {},
		        music_list_name: [],
	        }
	    },

	    computed: {
	    	songsNum: function () {
	    		return this.music_list.length;
	    	}
	    },

	    methods: {
	    	changeMusic (row) {
	    		this.$store.commit('modify_music', row.title);
	    		this.$store.commit('modify_music_list', this.music_list_name);
	    	}
	    },

	    created() {
	        let url = 'http://localhost:8080/localMusic/findAllMusic';

	        axios({
	            method: 'get',
	            url: url,
	        }).then(res => {
	            this.music_list = res.data;

	            for(let i=0; i<this.music_list.length; i++) {
	            	this.music_list_name.push(this.music_list[i]['title']);
	            }
	        })   
	    }
    }	
</script>

<style scoped>
    .favourite_head {
	 	height: 50px;
	 	background-color: white;
	 	padding-left: 10px;
	 	overflow: hidden;
    }

    .favourite_head_title {
	  	display: inline-block;
	  	font-size: 21px;
	  	float: left;
	  	line-height: 63px;
    }

    .favourite_head_count {
	  	display: inline-block;
	  	font-size: 14px;
	  	float: left;
	  	line-height: 69px;
	  	margin-left: 10px;
    }

 	.spilt {
 		border-top: 3px solid #c62f2f;
 	}
</style>