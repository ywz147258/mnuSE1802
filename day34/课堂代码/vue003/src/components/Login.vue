<template>
	<div id="">
		<table border="1">
			<tr>
				<td>账号</td>
				<td><input type="text" v-model="userName" id="userName" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" v-model="psw" id="psw" /></td>
			</tr>
			<tr>
				<td colspan="2"><button @click="submit" type="button">提交</button></td>
			</tr>
		</table>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				userName: "",
				psw: ""
			}
		},
		methods: {
			submit() {
				let that = this;
				that.postAjax("login", {
					userName: that.userName,
					psw: that.psw
				}, function(data) {
					console.log(data);
					if (data.data.success == "success") {
						that.$message('登陆成功');
						//把返回的sessionId存到localstorage里
						localStorage.setItem("sessionId",data.data.message);
						localStorage.setItem("userName",that.userName);
						that.$router.push('/bookList');
					} else {
						that.$message(data.data.message);
					}

				})
			}
		}
	}
</script>

<style>
</style>
