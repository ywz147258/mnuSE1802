<template>
	<view class="content">
		<view id="top">
			<uni-search-bar radius="100" placeholder="自定义圆角" @confirm="search" />
		</view>
		<view id="labelView">
			<view>
				炸鸡
			</view>
			<view>
				意面
			</view>
			<view>
				轻食
			</view>
				<view>
				饭
			</view>
		</view>
		<view id="imgHref">
			<view id="imgTop">
				<dl v-for="(index) in 5">
					<dd>
						<image 
						src="../../static/img/meishi.png" 
					></image></dd>
					<dd>美食</dd>
				</dl>
			</view>
			<view id="imgBottom">
				<dl v-for="(index) in 10">
					<dd>
						<image 
						src="../../static/img/xiawucha.png" 
					></image></dd>
					<dd>下午茶</dd>
				</dl>
			</view>
		</view>
	</view>
</template>


<script>
	import uniSearchBar from "../../components/uni-search-bar/uni-search-bar.vue"
	export default{
		components: {
			uniSearchBar
		},
		data(){
			
		},
		methods:{
			search(res) {
				uni.showToast({
					title: '搜索：' + res.value,
					icon: 'none'
				})
			}
		}
	}
</script>
<style>
	
	.content{
		background-color: gainsboro;
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	#top{
		width: 700upx;
		height: 70upx;
	}
	#labelView{
		width: 700upx;
		display: flex;
		flex-direction: row;
		align-items: center;
		justify-content: flex-start;
		height: 100upx;
	}
	#labelView view{
		padding: 20upx;
		padding-top: 10upx;
		padding-bottom: 10upx;
		background: ghostwhite;
		border-radius: 40%;
		margin-left: 10upx;
		
	}
	#imgHref{
		border-radius: 10upx;
		box-shadow: 2px 1px 3px 0px rgba(0,0,0,0.4);
		background-color: white;
	}
	#imgTop{
		width: 700upx;
		display: flex;
		flex-direction: row;
		justify-content: space-around;
		height: 200upx;
		align-items: center;
		
	}
	#imgTop image{
		height: 100upx;
		width: 100upx;
	}
	dd{
		text-align: center;
	}
	
	#imgBottom{
		width: 700upx;
		display: flex;
		flex-direction: row;
		justify-content: space-around;
		flex-wrap: wrap;
		height: 300upx;
		align-items: center;
	}
	
	#imgBottom dl{
		width: 120upx;
	}
	
	#imgBottom image{
		height: 50upx;
		width: 50upx;
	}
</style>
