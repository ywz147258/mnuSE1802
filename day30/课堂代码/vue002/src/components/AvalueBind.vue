<template>
	<div>
		<div id="">
			{{value}}
		</div>
		<div v-html="name" id="">
			
		</div>
		<div v-bind:class="type" v-bind:id="id">
			{{type}}
		</div>
		<div id="">
			<input type="text" v-model="name"  />
		</div>
	</div>
</template>

<script>
	export default {
	  data () {
	    return {
	      value: 'ywz',
		  name:"周杰伦",
		  type:'div',
		  id:'div'
	    }
	  }
	}
</script>

<style>
	.div{
		border: 1px solid red;
	}
	#div{
		color: red;
		font-size: 20pt;
	}
</style>
