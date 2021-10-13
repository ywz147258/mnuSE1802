<template>
	<div id="app">
		<a href="/">hello</a>
		<a href="/#/vb">值绑定</a>
		<a href="/#/if">IF</a>
		<a href="/#/for">FOR</a>
		<a href="/#/EVENT">事件</a>
		<a href="/#/computed">计算属性</a>
		<a href="/#/watch">监听属性</a>
		<a href="/#/zujian">组件</a>
		<a href="/#/axios">AJAX</a>
		<a href="/#/elm">ELEMENTUI</a>
		<router-view />
	</div>
</template>

<script>
	export default {
		name: 'App'
	}
</script>

<style>
	#app {
		font-family: 'Avenir', Helvetica, Arial, sans-serif;
		-webkit-font-smoothing: antialiased;
		-moz-osx-font-smoothing: grayscale;
		text-align: center;
		color: #2c3e50;
		margin-top: 60px;
	}
</style>
