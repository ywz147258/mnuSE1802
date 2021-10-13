<template>
	<div id="">
		<mh v-for="(item,index) in books" 
		:name="item.bookName" 
		:hot="item.hot" :detail="item.detail" :top="item.top">
		</mh>
	</div>
</template>

<script>
	//导入组件
	import mh from "./component/manhua"
	export default {
		//注册
		components: {
			mh
		},
		data() {
			return {
				books: [{
					bookName: "一人之下",
					hot: 100,
					detail: "何去何从",
					top: 1
				}, {
					bookName: "斗罗大陆",
					hot: 200,
					detail: "守护我。。。",
					top: 2
				}, {
					bookName: "斗破苍穹",
					hot: 300,
					detail: "悔婚",
					top: 3
				}]
			}
		}
	}
</script>

<style>
</style>
