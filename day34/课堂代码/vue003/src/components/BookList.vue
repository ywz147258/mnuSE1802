<template>
	<div id="">
		列表页
	</div>
</template>

<script>
	export default{
		data(){
			return{
				
			}
		},
		//页面加载时自动运行的事件
		mounted() {
			this.bookList();
		},
		methods:{
			bookList(){
				let that= this;
				that.postAjax("bookList",{
					userName:localStorage.getItem("userName"),
					sessionId:localStorage.getItem("sessionId")
				},function(data){
					// console.log(data);
					if(data.data.success=="fail"){
						that.$message("用户未登录");
						//如果不存在就跳到登陆页面
						that.$router.push("/login");
					}else{
						
					}
					
				})
			}
		}
	}
</script>

<style>
</style>
