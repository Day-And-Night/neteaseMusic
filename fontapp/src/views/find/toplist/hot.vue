<template>
  <div>
    <navigation></navigation>
    <toplistNav></toplistNav>
    <toplistContent ></toplistContent>
  </div>
</template>

<script>
  import navigation from '@/components/navigation.vue';
  import toplist_nav from '@/components/toplist_nav.vue'; 
  import toplist_content from '@/components/toplist_content.vue'; 

  export default {
    name: 'toplist_elevate',
    data() {
      return {
      };
    },
    methods: {

    },
    components: {
      navigation,
      toplistNav: toplist_nav,
      toplistContent: toplist_content,
    }
  }
</script>