<template>
<el-row class="tac">
  <el-col :span="4">
    <el-menu
      :default-active="$route.path"
      class="el-menu-vertical-demo"
      router= "router">
      <el-menu-item index="/main/find">
        <i class="el-icon-service"></i>
        <span slot="title">发现音乐</span>
      </el-menu-item>
      <el-menu-item index="/main/favourite">
        <i class="el-icon-service"></i>
        <span slot="title">我喜欢的音乐</span>
      </el-menu-item>
    </el-menu>
  </el-col>
</el-row>
</template>

<script>
  export default {
    data() {
      return {
        router: true,
      };
    },
    methods: {
    }
  }
</script>

<style scoped>
	.el-col {
		display: inline-block;
		width: 100%;
	}

	.el-col .el-menu .el-menu-item {
		text-align: left;
	}
</style>