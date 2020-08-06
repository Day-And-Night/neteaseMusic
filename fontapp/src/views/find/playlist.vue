<template>
  <div>
    <navigation></navigation>
    <div class="playlist">
      <div class="playlist_head">
        <div class="playlist_head_title">全部</div>
        <div class="playlist_head_select">
          <el-radio-group v-model="isCollapse" style="margin-bottom: 20px;" fill="#c62f2f">
            <el-radio-button :label="false">热门</el-radio-button>
            <el-radio-button :label="true">最新</el-radio-button>
          </el-radio-group>          
        </div>
      </div>
      <div class="spilt"></div>
      <div class="playlist_content">
        <coverlist></coverlist>          
      </div>
      <div class="pagination">
        <el-pagination
          background
          layout="prev, pager, next"
          :total="1000"
          prev-text="上一页"
          next-text="下一页">
        </el-pagination>        
      </div>
    </div>    
  </div>
</template>

<script>
	import navigation from '@/components/navigation';
  import coverlist from '@/components/coverlist';


  export default {
  	name: 'playlist',
    data() {
      return {
        isCollapse: true
      };
    },
    methods: {

    },
    components: {
    	navigation,
      coverlist,
    }
  }
</script>

<style scoped>
  .playlist {
    padding-top: 20px;
    padding-left: 30px;
    padding-right: 30px;
    padding-bottom: 40px;
    background-color: white;
  }

  /*歌单头部部分*/
  .playlist_head {
    overflow: hidden;
  }

  .playlist_head_select {
    float: right;   
  }

  .el-menu-vertical-demo:not(.el-menu--collapse) {
    width: 200px;
    min-height: 400px;
  }

  .playlist_head_title {
    float: left;
    font-size: 25px;
  }


  /*分割线*/
  .spilt {
    border-top: 3px solid #c62f2f;
    margin-bottom: 10px;
  }

  /*歌单内容部分*/

  .btn-prev {
    color: black;
  }

  .playlist_content {

    display: flex;
    flex-wrap: wrap;
    justify-content: space-between;
    margin-top: 30px;
  }
</style>


<style>
  /*用来修改默认的分页样式*/
  .el-pagination span:not([class*=suffix]) {
    min-width: 50px;
  }
</style>