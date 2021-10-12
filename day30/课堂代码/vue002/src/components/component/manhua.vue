<template>
	<div>
		<div id="parent">
			<div id="left">
				<!-- <img src="http://127.0.0.1:8848/imgs/img/0.jpg" > -->
				<img src="http://127.0.0.1:8848/imgs/img/0.jpg" >
			</div>
			<div id="middle">
				<div id="">
					{{name}}
				</div>
				<div id="">
					{{hot}}人气
				</div>
				<div id="">
					{{detail}}
				</div>
			</div>
			<div id="right">
				人气{{top}}
			</div>
		</div>
	</div>
</template>

<script>
	export default{
		props:{
			name:{
				type:String,
				default(){
					return "加载中"
				}
			},
			hot:{
				type:String,
				default(){
					return "加载中"
				}
			},
			detail:{
				type:String,
				default(){
					return "加载中"
				}
			},
			top:{
				type:String,
				default(){
					return "加载中"
				}
			}
		}
	}
</script>

<style>
	#parent{
		margin-bottom: 20px;
		width:400px;
		height: 100px;
		display: flex;
		flex-direction: row;
	}
	#left{
		width: 50px;
		height: 100px;
		
	}
	#left img{
		width: 100%;
		height: 100%;
	}
	#middle{
		width:250px;
		height:100px;
		display: flex;
		flex-direction: column;
		justify-content: space-between;
	}
	#right{
		width:100px;
		display: flex;
		flex-direction: row;
		justify-content:center;
		align-items: center;
	}
	
</style>
