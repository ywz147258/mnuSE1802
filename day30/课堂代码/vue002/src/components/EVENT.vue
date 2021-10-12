<template>
	<div id="">
		<div id="">
			{{msg}},{{name}}
		</div>
		<button type="button" v-on:click="hello()">赋值</button>
		<button type="button" @click="chageName()">名字</button>
		<button type="button" 
		v-on:click="methodParam('带参数')">参数</button>
		<form action="http://www.baidu.com" method="post">
			<button type="submit" v-on:click="submit($event)">提交</button>
		</form>
		
		<input v-on:keyup.13="print($event)" />
		
	</div>
</template>

<script>
	export default {
		data() {
			return {
				msg: "你好啊",
				name: "约翰"
			}
		},
		methods: {
			hello() {
				let that = this;
				that.msg = "hello";
			},
			chageName() {
				let that = this;
				that.name = "亦凡";
			},
			//带参数
			methodParam(message) {
				alert(message)
			},
			//禁止按钮的默认事件
			submit(event){
				alert("禁止跳转");
				event.preventDefault();
			},
			//获取输入框的值
			print(event){
				alert(event.target.value);
			}
		}
	}
</script>

<style>
</style>
