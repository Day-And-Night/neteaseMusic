<template>
	<navigation></navigation>
</template>

<script>
	import navigation from '@/components/navigation';

  export default {
  	name: 'artist',
    data() {
      return {
        activeIndex: '1',
        activeIndex2: '1'
      };
    },
    methods: {

    },
    components: {
    	navigation,
    }
  }
</script>