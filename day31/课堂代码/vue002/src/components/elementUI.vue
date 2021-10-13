<template>
	<div id="">
		<el-time-select v-model="value" :picker-options="{
		    start: '08:30',
		    step: '00:15',
		    end: '18:30'
		  }" placeholder="选择时间">
		</el-time-select>
		<el-date-picker v-model="value1" type="date" placeholder="选择日期">
		</el-date-picker>
		<i class="el-icon-delete" v-on:click="deletes()"></i>
		<el-dialog title="提示" :visible.sync="dialogVisible" width="30%" :before-close="handleClose">
			<span>这是一段信息</span>
			<span slot="footer" class="dialog-footer">
				<el-button @click="dialogVisible = false">取 消</el-button>
				<el-button type="primary" @click="dialogVisible = false">确 定</el-button>
			</span>
		</el-dialog>
	</div>
</template>

<script>
	export default {
		data() {
			return {
				value: '',
				value1: ''
			};
		},
		methods: {
			deletes() {
				this.$confirm('确认关闭？')
					.then(_ => {
						done();
					})
					.catch(_ => {});
			}
		}
	}
</script>

<style>
</style>
