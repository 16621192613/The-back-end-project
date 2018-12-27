<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<!DOCTYPE HTML> 
<html>
	<head>
		<title>天使导医</title>
		<meta charset="utf-8">
		<%@ include file="/jsp/lib.jsp"%>
		<%@ include file="/jsp/link.jsp"%>
		<style>
			.ibox-title h3 {
			    display: inline-block;
			    margin: 0 0 7px;
			    padding: 0;
			    text-overflow: ellipsis;
			    float: left;
			}
			.cm_tr{
			  padding-right: 2px;  
	          padding-left: 0px;   
			}
		</style>
	</head>
<body class="gray-bg">
		<div class="wrapper wrapper-content animated fadeInRight ">
			<div class="col-sm-3">
				<div class="ibox float-e-margins" >
					<!-- 标题栏区域 begin-->
					<div class="ibox-title" style="border-width: 1px 0px 0">
						<!-- 标题文字区域begin -->
						<h3 style="color:#034392">
							<i class="fa fa-calendar"></i>&nbsp;&nbsp;接口列表
						</h3>
						<!-- 标题文字区域end -->
					</div>
					<!-- 标题栏区域 end-->
					<!-- 操作区域 begin-->
					<div class="ibox-content">
						<div class="scrollbarlist">
							<div class="panel-body">
								<ul id="tree" class="ztree" style="overflow:auto;"></ul>
							</div>
						</div>
					</div>
					<!-- 操作区域 end-->
				</div>
			</div>
		
			<div class="col-sm-9">
		    <!-- 标题栏区域 begin-->
				<div class="ibox-title" style="border-width: 1px 0px 0">
					<!-- 标题文字区域begin -->
					<h3 style="color:#034392">
						<i class="fa fa-diamond"></i>&nbsp;&nbsp;接口信息
					</h3>
					<!-- 标题文字区域end --> 
					<div class="ibox-tools" id="win_tools_but"   > 
					</div>
				</div>
				<!-- 标题栏区域 end-->
				<!-- 查询区域begin -->
				<div class="ibox-content" style="padding: 5px 10px 10px;">
					<!-- 提示信息区域begin -->
				    <div class="row" style="border:1px solid #8BB4E7;border-left:6px solid #8BB4E7;padding:15px;background-color: #F5F8FD;margin:0px">
						<h4 style="padding-bottom: 10px;">接口描述</h4>
						<p style="font-size: 13px;" id="jkmsDiv">
							接口描述接口描述接口描述接口描述接口描述接口描述接口描述接口描述
						</p>
					</div>
					<div class="row" style="height:8px;">&nbsp;</div>
					<form class="form-horizontal form-bordered" role="form">
					<div class="row">
			            <div class="col-md-12">
			                <div class="ibox float-e-margins" style="margin-bottom:0px">
				                <!-- 表单标题区域begin -->
						            <div class="ibox-title" style="border-width: 1px 0px 0">
				                        <h3 style="color:#034392"><li class="fa fa-desktop"></li>&nbsp;&nbsp;接口参数</h3>
				                    </div>
				                <!-- 表单标题区域end -->
			                    <div class="ibox-content" style="padding-bottom:5px" id="inputDiv">
			                    </div>
			                </div>
			            </div>
			       </div>
			       <div id="listDiv">
			       </div>
			       <div class="row" style="height:8px;">&nbsp;</div>
			       <div class="row" id="resultDiv">
			            <div class="col-md-12">
			                <div class="ibox float-e-margins" style="margin-bottom:0px">
				                <!-- 表单标题区域begin -->
						            <div class="ibox-title" style="border-width: 1px 0px 0">
				                        <h3 style="color:#034392"><li class="fa fa-info"></li>&nbsp;&nbsp;返回结果</h3>
				                    	<div class="ibox-tools" >
											<a class="btn-sm btn-success" href="javascript:save()" style="color:#fff"><i class="fa fa-check"></i>&nbsp;提交</a>
				                     	</div>
						            </div>
				                <!-- 表单标题区域end -->
			                    <div class="ibox-content" style="padding-bottom:5px" >
			                    	<div class="form-group " style="margin-bottom: 8px;">
			                    		<div class="col-md-12 cm_tr">
			                    			<textarea placeholder="返回结果" id="resultText" class="form-control" style="height:180px"></textarea>
			                    		</div>
			                    	</div>
			                    </div>
			                </div>
			            </div>
			       </div>
			       </form>
				</div>
			<!-- 查询区域end -->
			</div>
		</div>
	</body> 
</html>
<script src="<c:url value='/javaScript/dataList/interface.js?v=18'/>"></script>
<script src="<c:url value='/javaScript/main/index.js?32'/>"></script>
