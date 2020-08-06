<template>
	<navigation></navigation>
</template>

<script>
	import navigation from '@/components/navigation';

  export default {
  	name: 'djradio',
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