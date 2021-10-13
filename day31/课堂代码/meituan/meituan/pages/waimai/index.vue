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
		<!-- 展示店铺列表 -->
		<view id="storeList">
			<store v-for="(item,index) in storeList" 
			:appraise="item.appraise"
			:avg="item.avg"
			:km="item.km"
			:minute="item.minute"
			:sale="item.sale"
			:score="item.score"
			:title="item.title"
			class="storeItem"></store>
		</view>
	</view>
</template>


<script>
	import store from "../../component/store.vue";
	import uniSearchBar from "../../components/uni-search-bar/uni-search-bar.vue"
	export default{
		components: {
			uniSearchBar,
			store
		},
		data(){
			return {
				storeList:[
					{
						title:"塔斯汀中国汉堡",
						score:4.7,
						sale:"2000+",
						avg:23,
						minute:40,
						km:2.7,
						appraise:"非常好吃"
					},
					{
						title:"暮雪亭",
						score:4.8,
						sale:"1000+",
						avg:23,
						minute:40,
						km:2.7,
						appraise:"非常好吃"
					}
				]
			}
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
		margin-top: 20upx;
		padding-top: 20upx;
		border-top-left-radius: 10%;
		border-top-right-radius: 10%;
		background:linear-gradient(#FEFEFE,#F6F6F6);
		display: flex;
		flex-direction: column;
		justify-content: center;
		align-items: center;
	}
	#top{
		width: 700upx;
		height: 100upx;
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
		background: #F1F1F1;
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
	.storeItem{
		border-radius: 10upx;
		box-shadow: 2px 1px 3px 0px rgba(0,0,0,0.4);
		background-color: white;
		margin-top: 30upx;
		padding: 20upx;
	}
</style>
