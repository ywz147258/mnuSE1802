<template>
	<div id="div">
		<h1 v-if="seeOne">{{msg1}}</h1>
		<h1 v-if="seeTwo">{{msg2}}</h1>
		<h1 v-show="seeThree">{{msg3}}</h1>
		<button @click="show()">显示英雄联盟</button>
	</div>
</template>

<script>
	export default{
		data(){
			return {
				seeOne:false,
				seeTwo:true,
				seeThree:false,
				msg1:"英雄联盟",
				msg2:"王者荣耀",
				msg3:"dota"
			}
		},
		methods:{
			show(){
				let that=this;
				if(that.seeOne==true){
					that.seeOne=false
				}else{
					that.seeOne=true
				}
			}
		}
	}
</script>

<style>
	
</style>
