<template>
  <div id="app">
    <Nav class="nav"></Nav>
    <sidebar class="sidebar"></sidebar>
    <router-view class="main"></router-view>
    <Footer class="footer"></Footer>
  </div>
</template>

<script>
import Nav from '@/components/nav.vue'
import sidebar from '@/components/sidebar.vue'
import Footer from '@/components/footer.vue'

export default {
  name: 'App',
  components: {
    Nav,
    sidebar,
    Footer
  }
}
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
  }

  body {
    margin: 0;
    padding: 0;
    background-color: #f5f8f9;
  }

  .sidebar {
    position: fixed;
    float: left;
    margin-top: 20px;
    margin-left: 20px;
    height: 80vh;
    background-color: white;
  }

  .main{
    float: left;
    width: 75%;
    margin-top: 20px;
    margin-left: 280px;
    margin-bottom: 54px;
    background-color: #fff;
  }

  .footer {
    position: fixed;
    height: 50px;
    width: 100%;
    bottom: 0px;
  }

</style>
