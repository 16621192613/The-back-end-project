<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
  <head> 
   <title>采购中心</title> 
   <%@ include file="/jsp/lib.jsp"%> 
	<%@ include file="/jsp/link.jsp"%>
	<script src="<c:url value='/javaScript/website/sysWebsiteInfoList.js?08'/>"></script>
  </head> 
<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>
							<i class="fa fa-ra"></i>站点管理 
						</h5>
						<div class="ibox-tools">
							<button type="button" class="btn btn-round btn-default btn-sm fa fa-search" onclick="search()">&nbsp;查询</button>
							<button type="button" class="btn btn-round btn-info btn-sm fa fa-edit" onclick="add()">&nbsp;添加</button>
						</div>
					</div>
					<div class="ibox-content">

						<div role="grid" class="dataTables_wrapper form-inline"
							id="DataTables_Table_0_wrapper"> 

									<!--条件输入区域begin-->
					               <div class="row">
					                    <form id="queryForm">
					                    <label class="control-label col-sm-1">站点名称</label>
					                    <div class="controls col-sm-2">
					                      <input type="text" class="form-control" placeholder="站点名称" name="websitName" value="">
					                    </div>
					                    </form>
					                </div>
					               
									<!--条件输入区域end-->
									<!--表格区域begin--> 
					                     <table id="datagrid1" class="mmg" ></table>
								         <div id="pg" style="text-align: right;"></div> 
									<!--表格区域end-->

 

						</div>
					</div>
				</div>
			</div>

		</div>
</body>
</html>

 