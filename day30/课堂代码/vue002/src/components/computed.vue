<template>
	<div id="">
		<input type="text" v-model="qm" />千米
		={{mi}}米
		<br/>
		<input type="text" v-model="liang"/>两={{gram}}克{{ounce}}盎司
	</div>
</template>

<script>
	export default{
		data(){
			return{
				qm:0,
				ounce:0,
				gram:0,
				liangTemp:0
			}
		},
		computed:{
			//计算属性
			mi:function(){
				return this.qm*1000;
			},
			//通过计算属性的方式来监听变量
			liang:{
				get:function(){
					return this.liangTemp;
				},
				set:function(val){
					console.log(val);
					this.liangTemp=val;
				}
			}
		}
	}
</script>

<style>
</style>
