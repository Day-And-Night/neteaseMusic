<template>
	<div class="nav">
		<el-menu :default-active="$route.path" class="el-menu-demo" mode="horizontal" router= "router">
	    	<el-menu-item index="/main/find" class="logo"><img src="@/assets/img/logo.png"></el-menu-item>	
	    	<el-menu-item index="/main/update">更新日志</a></el-menu-item>				
			<el-menu-item index="/main/about">关于</a></el-menu-item>
		</el-menu>
	</div>

</template>

<script>
  export default {
    data() {
      return {
      };
    },
    methods: {
    }
  }
</script>

<style scoped>
	.nav {
		background-color: #c62f2f;
		height: 60px;
		width: 100%
	}

	.el-menu {
		background-color: #c62f2f;
	}

	.el-menu-item {
		color: white;
		font-weight: bold;
		float: right;
	}

	.logo {
		float: left;
		background-color: #c62f2f;
	}

	.logo:focus {
		outline: 0px;
	}

	.el-menu--horizontal>.el-menu-item:not(.is-disabled):hover {
		background-color: #c62f2f;
		color: white;
	}

	.el-menu--horizontal>.el-menu-item:not(.is-disabled):focus {
		background-color: #c62f2f;
	}

	.el-menu--horizontal .el-menu-item:not(.is-disabled):focus {
		color: white;
	}	

	.el-menu--horizontal>.el-menu-item.is-active {
		background-color: #c62f2f;
		color: white;
		border-bottom: 2px solid white;
	}

</style>