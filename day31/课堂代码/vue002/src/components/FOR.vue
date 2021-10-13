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
		<br>
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
					<td>
						<button type="button" @click="deletes(value)">删除</button>
					</td>
			</tr>
			<tfoot>
				<tr>
					<td colspan="3">
						<button v-for="(value,index) in buttons" type="button" v-on:click="page" v-bind:id="value.id">
							{{value.value}}
						</button>
					</td>
				</tr>
			</tfoot>
		</table>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				buttons: [{
						id: 1,
						value: "第1页"
					},
					{
						id: 2,
						value: "第2页"
					},
					{
						id: 3,
						value: "第3页"
					}
				],
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
			},
			page(event) {
				// console.log(event.target.id);
				let that = this;
				if (event.target.id == 1) {
					that.books = [{
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
				if (event.target.id == 2) {
					that.books = [{
							id: 33,
							name: "斗罗大陆1",
							author: "不知道"
						},
						{
							id: 44,
							name: "斗罗大陆2",
							author: "不知道"
						},
						{
							id: 55,
							name: "斗罗大陆3",
							author: "不知道"
						},
						{
							id: 77,
							name: "斗罗大陆4",
							author: "不知道"
						}
					]
				}
				if (event.target.id == 3) {
					that.books = [{
							id: 33,
							name: "元龙1",
							author: "不知道"
						},
						{
							id: 44,
							name: "元龙12",
							author: "不知道"
						},
						{
							id: 55,
							name: "元龙13",
							author: "不知道"
						},
						{
							id: 77,
							name: "元龙14",
							author: "不知道"
						}
					]
				}
			},
			deletes(row){
				let that=this;
				for(var i in that.books){
					if(row.id==that.books[i].id){
						 that.books.splice(i, 1);
					}
				}
				console.log(row);
			}
		}
	}
</script>

<style>

</style>
