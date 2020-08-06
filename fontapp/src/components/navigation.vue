<template>
	<div class="navigation">
		<el-menu :default-active="$route.path" class="el-menu-demo" mode="horizontal" router>
  		    <el-menu-item index="/main/find">个性推荐</el-menu-item>
            <el-menu-item index="/main/find/playlist">歌单</el-menu-item>
            <el-menu-item index="/main/find/djradio">主播电台</el-menu-item>
            <el-menu-item index="/main/find/toplist/elevate">排行榜</el-menu-item>
            <el-menu-item index="/main/find/artist">歌手</el-menu-item>
            <el-menu-item index="/main/find/new">最新音乐</el-menu-item>
		</el-menu>		
	</div>
</template>

<script>
    export default {
    	name: 'navigation',
        data() {
            return {
              
            };
        },
        methods: {
            
        },
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
</style>