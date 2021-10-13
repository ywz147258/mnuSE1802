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
		      width="150">
		    </el-table-column>
		    <el-table-column
		      prop="name"
		      label="书名"
		      width="120">
		    </el-table-column>
		    <el-table-column
		      prop="href"
		      label="连接"
		      width="120">
		    </el-table-column>
		    <el-table-column
		      fixed="right"
		      label="操作"
		      width="100">
		      <template slot-scope="scope">
		        <el-button @click="handleClick(scope.row)" type="text" size="small">查看</el-button>
				<i class="el-icon-edit"></i>
		        <!-- <el-button type="text" size="small">编辑</el-button> -->
		      </template>
		    </el-table-column>
		  </el-table>
	</div>
  </template>

  <script>
    export default {
      data() {
        return {
          tableData: [{
            id: 1,
            name: '斗破苍穹',
            href: 'http://www.baidu.com'
          },
		  {
		    id: 2,
		    name: '斗破苍穹',
		    href: 'http://www.baidu.com'
		  },
		  {
		    id: 3,
		    name: '斗破苍穹',
		    href: 'http://www.baidu.com'
		  },
		  {
		    id: 4,
		    name: '斗破苍穹',
		    href: 'http://www.baidu.com'
		  }]
        }
      }
    }
  </script>

<style>
</style>
