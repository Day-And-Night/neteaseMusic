<template>
	<div class="coverlist">
		<div class="coverlist_img">
			<a :href="coverlist_url"><img :src="url"></a>
			<div class="view_counts">
				<i class="el-icon-headset"></i>
				<p class="view_amount">{{ coverlist_data.playCount }}</p>
				<a :href="coverlist_url"><i class="el-icon-video-play"></i></a>
			</div>
		</div>
		<div class="coverlist_text"><a :href="coverlist_url" >{{ coverlist_data.name }}</a></div>
	</div>	
</template>

<script>
  export default {
  	name: 'coverlist',
    props: ['coverlist_data'],
    data() {
      return {
      };
    },
    methods: {

    },
    computed: {
    	url: function () {
    		return this.coverlist_data.coverImgUrl;
    	},
    	coverlist_url: function () {
    		return "/#/main/find/playlist/playlist_music_list?id=" + this.coverlist_data.id;
    	},
    },
  }	
</script>

<style scoped>
 	.coverlist {
 		display: inline-block;
 		height: 100%;
 		width: 150px;
 		margin-bottom: 40px;

 	}

	.coverlist_img {
		position: relative;
		height: 150px;
		width: 150px;
	}

	.coverlist_img img {
		height: 100%;
		width: 100%;
	}


	/*播放数量*/
	.view_counts {
		width: 100%;
		height: 28px;
		background-color: black;
		position: absolute;
		bottom: 0px;

		opacity:0.5;
	}

	.el-icon-headset {
		position: absolute;
		left: 12px;
		top: 7px;
		opacity: 1;
		color: #ccc;
	}

	.el-icon-video-play {
		position: absolute;
		right: 12px;
		top: 7px;
		opacity: 1;
		color: #ccc;
	}

	.view_amount {
		position: absolute;
		left: 36px;
		top: -10px;
		opacity: 1;	
		color: #ccc;
		font-size: 13px;
		line-height: 24px;
	}



	/*歌单简介*/
  .coverlist_text {

  	text-align: left;
  }

  .coverlist_text a {
  	color: black;
  	text-decoration: none;
  	font-size: 14px;
  	font-weight: 400;
  }

  .coverlist_text a:hover {
  	text-decoration:underline;
  }
</style>