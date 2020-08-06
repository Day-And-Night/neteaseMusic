<template>
  <div>
    <navigation></navigation>
    <toplistNav></toplistNav>

  </div>

</template>

<script>
  //
	import navigation from '@/components/navigation';
  import toplist_nav from '@/components/toplist_nav';

  export default {
  	name: 'toplist',
    data() {
      return {
      };
    },
    methods: {

    },
    components: {
    	navigation,
      toplistNav: toplist_nav,
    }
  }
</script>

<style scoped>

</style>