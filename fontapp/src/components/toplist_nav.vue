<template>
  <div class="toplistSide">
    <el-row class="tac">
      <el-col :span="24">
        <el-menu
          :default-active="$route.path"
          class="el-menu-vertical-demo"
          router
          >
          <el-menu-item index="/main/find/toplist/elevate">
            <img src="@/assets/img/toplist1.jpg">
            <span slot="title">云音乐飙升榜</span>
          </el-menu-item>
          <el-menu-item index="/main/find/toplist/new">
            <img src="@/assets/img/toplist2.jpg">
            <span slot="title">云音乐新歌榜</span>
          </el-menu-item>
          <el-menu-item index="/main/find/toplist/original">
            <img src="@/assets/img/toplist3.jpg">
            <span slot="title">网易原创歌曲榜</span>
          </el-menu-item>
          <el-menu-item index="/main/find/toplist/hot">
            <img src="@/assets/img/toplist4.jpg">
            <span slot="title">云音乐热歌榜</span>
          </el-menu-item>
        </el-menu>
      </el-col> 
    </el-row>     
  </div>  	
</template>

<script>
	
</script>

<style scoped>
  /*清除浮动*/
  .toplistSide {
    overflow: hidden;
  }


  .toplistSide {
    float: left;
  }


  /*左侧样式*/
  .el-menu {
    padding-top: 20px;
  }


  .el-menu-item {
    text-align: left;
  }
</style>