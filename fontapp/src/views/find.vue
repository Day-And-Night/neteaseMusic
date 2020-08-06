<template>
	<div>
		<navigation></navigation>
		<!-- 轮播图 -->
	    <div class="carousel">
	        <el-carousel trigger="click" height="336px">
			  	<el-carousel-item :key="1">
			  		<div class="playlist">
			  			<a href="javascript:;"><img src="@/assets/img/carousel11.jpg"></a>
			  		</div>
			  	</el-carousel-item>
			  	<el-carousel-item :key="2">
			  		<div class="playlist">
			  			<a href="javascript:;"><img src="@/assets/img/carousel12.jpg"></a>
			  		</div>
			  	</el-carousel-item>
			  	<el-carousel-item :key="3">
			  		<div class="playlist">
			  			<a href="javascript:;"><img src="@/assets/img/carousel13.jpg"></a>
			  		</div>
			  	</el-carousel-item>
	        </el-carousel>
	    </div>
	    <!-- 推荐歌单 -->
		<div class="recommend">
			<div class="recommend_title">
				<p class="recommend_text">推荐歌单</p>
				<p class="recommend_more">更多></p>				
			</div>
			<div class="spilt"></div>
			<div class="recommend_content">
				<coverlist v-for="(item, index) in coverlists" :coverlist_data="item" :key="index"></coverlist>
			</div>
		</div>
	</div>
</template>

<script>
	import axios from 'axios'
	import navigation from '@/components/navigation';
	import coverlist from '@/components/coverlist';

    export default {
  	    name: 'find',
        data() {
            return {
	            coverlists: [],
            };
        },
	    methods: {

	    },

	    created() {
	        //获取所有的歌单
	        let url = 'http://localhost:8080/musicList/findAllMusicList';

	        axios({
	            method: 'get',
	            url: url,
	        }).then(res => {
	            let data = res.data;
	            this.coverlists = data;
	        })
	    },

	    components: {
	    	navigation,
	    	coverlist,
	    }
    }
</script>

<style scoped>
	.el-menu {
		width: 100%;
		border-bottom: 0px;
	}

	.el-menu-demo {
		display: flex;
		justify-content: center;
	}

	.carousel {
		background-color: white;
	}

  .el-carousel__item h3 {
    color: white;
    font-size: 14px;
    opacity: 0.75;
    line-height: 150px;
    margin: 0;
  }

  .recommend {
  	height: 100%;
  	background-color: white;
  	padding-top: 40px;
  	padding-left: 30px;
  	padding-right: 30px;
  }

  .recommend_title {
  	overflow: hidden;
  	margin-bottom: 3px;
  }

 	.recommend_text {
 		display: inline-block;
 		float: left;
 		font-size: 20px;
 		margin: 0px;
 	}

 	.recommend_more {
 		display: inline-block;
 		float: right;
 		font-size: 14px;
 		margin: 0px; 	
 		line-height: 23px;	
 	}

 	.spilt {
 		border-top: 3px solid #c62f2f;
 		margin-bottom: 10px;

 	}

 	.recommend_content {
 		display: flex;
 		flex-wrap: wrap;

 	}

 	.recommend_content .coverlist {
 		margin-left: 33px;
 		margin-right: 32px;
 	}

</style>