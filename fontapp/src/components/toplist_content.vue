<template>
	<div class="content">
		<div class="content_head">
			<img src="@/assets/img/toplist_head1.jpg">
			<div class="headline">云音乐飙升榜</div>
			<div class="update_time"><i class="el-icon-time"></i>最近更新：06月13日 （每天更新）</div>
		</div>
		<div class="songs_list">
			<div class="list_head">
				<div class="list_head_headline">歌曲列表</div>
				<div class="list_head_amount">{{ songsNum }}首歌</div>
				<div class="list_head_playtimes">播放：2027121536次</div>
			</div>
			<div class="spilt"></div>
			<div class="list_content">
			  <el-table
			    :data="tableData"
			    stripe
			    style="width: 100%">
			    <el-table-column
			      prop="number"
			      label=""
			      width="50">
			    </el-table-column>
			    <el-table-column
			      prop="title"
			      label="音乐标题"
			      width="300">
			    </el-table-column>
			    <el-table-column
			      prop="singer"
			      label="歌手">
			    </el-table-column>
			    <el-table-column
			      prop="album"
			      label="专辑">
			    </el-table-column>
			    <el-table-column
			      prop="time"
			      label="时长">
			    </el-table-column>
			  </el-table>			
			</div>
		</div>		
	</div>
</template>

<script>
  export default {
  	name: 'toplist_content',
    data() {
      return {
        tableData: [
	        {
	          number: '01',
	          title: 'LoveStory',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        }, 
	        {
	          number: '02',
	          title: 'Time',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        }, 
	        {
	          number: '03',
	          title: 'Blank Space',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        }, 
	        {
	          number: '04',
	          title: 'I Knew You Were Trouble',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '05',
	          title: 'Shake It Off',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '06',
	          title: 'We Are Never Ever Getting Back Together',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '07',
	          title: '最后的战役',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '08',
	          title: 'You Belong With Me',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '09',
	          title: '小永远',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '10',
	          title: '想太多',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '11',
	          title: '码头姑娘',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '12',
	          title: '尽头',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
	        {
	          number: '13',
	          title: '一路向北',
	          singer: '霉霉',
	          album: '我不知道',
	          time: '我不知道',
	          size: '3.55 MB',
	        },
        ],
        
      }
    },
    computed: {
    	songsNum: function () {
    		return this.tableData.length;
    	}
    },
    props: ['toplistImg'],
    methods: {
    },
  }

</script>

<style scoped>
	.content {
		float: left;
		padding-left: 50px;
		padding-right: 50px;
		width: 667px;
	}

	/*排行榜头部*/
	.content_head {
		position: relative;
		height: 300px;
	}

	.content_head img {	
		position: absolute;

		left: 20px;
		top: 50px;
	}

	.headline {
		position: absolute;
		top: 63px;
		left: 204px;
		font-size: 20px;
		font-weight: normal;
	}

	.update_time {
		position: absolute;
		top: 100px;
		left: 204px;		
	}

	/*排行榜歌单*/
	.songs_list {
	}

	.list_head {
		overflow: hidden;
		padding-left: 20px;
	}

	.list_head_headline {
		float: left;
		font-size: 20px;
		line-height: 28px;
	}

	.list_head_amount {
		float: left;
		font-size: 12px;
		margin: 9px 0px 0px 20px;
	}

	.list_head_playtimes {
		font-size: 12px;
		margin-top: 9px;
		float: right;
	}

 	.spilt {
 		border-top: 3px solid #c62f2f;
 		margin-left: 20px;
 		margin-bottom: 10px;
 	}

 	.list_content {
	 	background-color: white;
	 	padding-left: 20px;
	 	overflow: hidden; 		
 	}
</style>