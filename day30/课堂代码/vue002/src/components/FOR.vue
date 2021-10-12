<template>
	<div id="">
		<div v-for="(value,index) in arr" id="parent">
			{{value}}
		</div>
		<table border="1">
			<tr v-for="(value,index) in arr">
				<td>{{value}}</td>
			</tr>
		</table>
		<table border="" cellspacing="" cellpadding="">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>author</th>
			</tr>
			<tr v-for="(value,index) in books">
				<td>{{index+1}}</td>
				<td>{{value.name}}</td>
				<td>{{value.author}}</td>
			</tr>
		</table>
		<button type="button" @click="animata()">动画</button>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				arr: ["a", "b", "c"],
				books: [{
						id: 33,
						name: "斗破苍穹1",
						author: "不知道"
					},
					{
						id: 44,
						name: "斗破苍穹2",
						author: "不知道"
					},
					{
						id: 55,
						name: "斗破苍穹3",
						author: "不知道"
					},
					{
						id: 77,
						name: "斗破苍穹4",
						author: "不知道"
					}
				]
			}
		},
		methods: {
			animata() {
				var dom = document.getElementById("parent");
				dom.setAttribute("style", "color:red");
			}
		}
	}
</script>

<style>

</style>
