<template>
	<view class="contentStore">
		<view class="left">
			<image src="../static/img/hb.png"></image>
		</view>
		<view class="right">
			<view>
				{{title}}
			</view>
			<view>
				<view>
					<uni-icons type="star-filled" color="#FB8227" size="25" />{{score}}
					月售{{sale}} 人均￥{{avg}}
				</view>
				<view>
					美团专送
				</view>
			</view>
			<view>
				<view>
					起送￥{{price}} 免费配送
				</view>
				<view>
					{{minute}}分钟 {{km}}km
				</view>
			</view>
			<view>
				{{appraise}}
			</view>
		</view>
	</view>
</template>

<script>
	export default{
		props:{
			title:{
				type:String,
				default(){
					return "加载中"
				}
			},
			score:{
				type:Number,
				default(){
					return 0
				}
			},
			sale:{
				type:String,
				default(){
					return "加载中"
				}
			},
			avg:{
				type:Number,
				default(){
					return 0
				}
			},
			minute:{
				type:Number,
				default(){
					return 0
				}
			},
			km:{
				type:Number,
				default(){
					return 0
				}
			},
			appraise:{
				type:String,
				default(){
					return "加载中"
				}
			}
		}
	}
</script>

<style>
	.contentStore{
		width: 650upx;
		display: flex;
		flex-direction: row;
		justify-content: space-between;
	}
	.left{
		width: 230upx;
	}
	.left image{
		width: 200upx;
		height: 200upx;
	}
	.right{
		width: 500upx;
		display: flex;
		flex-direction: column;
		justify-content: space-between;
	}
	.right > view:nth-child(2),.right > view:nth-child(3){
		display: flex;
		flex-direction: row;
		justify-content: space-between;
		align-items: center;
	}
</style>
