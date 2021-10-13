<template>
	<div id="">
		 <el-table
		    :data="tableData"
		    border
		    style="width: 100%">
		    <el-table-column
		      fixed
		      prop="id"
		      label="主键"
			  width="100"
		      >
		    </el-table-column>
		    <el-table-column
		      prop="name"
		      label="书名"
		      >
		    </el-table-column>
		    <el-table-column
		      prop="href"
		      label="连接"
		      >
		    </el-table-column>
		    <el-table-column
		      label="操作"
		      width="100">
		      <template slot-scope="scope">
		        <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
				<i class="el-icon-edit"></i>
		        <!-- <el-button type="text" size="small">编辑</el-button> -->
		      </template>
		    </el-table-column>
		  </el-table>
		  <div class="block">
		    <el-pagination
		      layout="prev, pager, next"
		      :total="count"
			  :page-size="pageSize"
			  @current-change="pageChange">
		    </el-pagination>
		  </div>
	</div>
  </template>

  <script>
    export default {
      data() {
        return {
          tableData: [],
		  count:0,
		  pageSize:5
        }
      },
	  mounted(){
		let that=this;
		//获取书本列表
		this.getBookList(
			{ 
				start:0,
				limit:that.pageSize,
				name:"",
			}
		 );
		this.getBookCount();
	  },
	  methods:{
		  pageChange(nowPage){
			  let that=this;
			 let param={
				 start:nowPage*that.pageSize-that.pageSize,
				 limit:that.pageSize,
				 name:""
			 }
			 that.getBookList(param);
		  },
		  getBookList(param){
			  let that=this;
			  this.postAjax("http://localhost:8082/book/getBooks",
			  param
			  ,function(data){
			  	that.tableData=data.data;
			  })
		  },
		  getBookCount(){
			  let that=this;
			  this.postAjax("http://localhost:8082/book/getBookCounts",
			  {
			  	name:''
			  }
			  ,function(data){
			  	that.count=data.data;
			  })
		  }
	  }
    }
  </script>

<style>
</style>
