<template>
	<div id="">
		<input type="text" v-model="qm" />千米
		={{mi}}米
	</div>
</template>

<script>
	export default{
		data(){
			return {
				qm:0,
				mi:0
			}
		},
		watch:{
			qm:function(val){
				this.mi=val*1000;
			}
		}
	}
</script>

<style>
</style>
