<template>
	<div id="">

	</div>
</template>

<script>
	export default {
		data() {
			return {}
		},
		//一开进入页面默认执行的函数
		mounted() {
			let that = this;
			that.ajax();

		},
		methods: {
			ajax() {
				var param = {
					name: "ywzaaa"
				};
				var qs = require('qs');
				param = qs.stringify(param);
				this.axios.post("http://localhost:8081/ajax/test2", param)
					.then((response) => {
						console.log(response)
					})
			}
		}
	}
</script>

<style>
</style>
