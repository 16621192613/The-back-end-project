<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<!DOCTYPE HTML> 
<html>
	<head>
		<title>天使导医</title>
		<meta charset="utf-8">
		<%@ include file="/jsp/lib.jsp"%>
		<%@ include file="/jsp/link.jsp"%>
		<style>
			 
		</style>
	</head>
<body class="gray-bg">
		<div class="wrapper wrapper-content animated fadeInRight ">
		<!-- 标题栏区域 begin-->
				<div class="ibox-title" style="border-width: 1px 0px 0">
					<!-- 标题文字区域begin -->
					<h3 style="color:#034392">
						<i class="fa fa-diamond"></i>&nbsp;&nbsp;接口信息
					</h3>
					<!-- 标题文字区域end --> 
					<div class="ibox-tools" id="win_tools_but"> 
					</div>
				</div>
		<!-- 标题栏区域 end-->
			<!-- 查询区域begin -->	
				<div class="ibox-content" style="padding: 5px 10px 10px;">
					<!-- 提示信息区域begin -->
				    <div class="row" style="border:1px solid #8BB4E7;border-left:6px solid #8BB4E7;padding:15px;background-color: #F5F8FD;margin:0px">
						<h4 style="padding-bottom: 10px;">接口描述</h4>
						<p style="font-size: 13px;" id="jkmsDiv">批量新增排班信息</p>
					</div>
					<div class="row" style="height:8px;">&nbsp;</div>
					<form class="form-horizontal form-bordered" role="form">
					<div class="row">
			            <div class="col-md-12">
						<div class="ibox float-e-margins" style="margin-bottom:0px">
							<!-- 表单标题区域begin -->
							<div class="ibox-title" style="border-width: 1px 0px 0">
								<h3 style="color:#034392">
									<li class="fa fa-desktop"></li>&nbsp;&nbsp;接口参数
								</h3>
							</div>
							<!-- 表单标题区域end -->
							<div class="ibox-content" style="padding-bottom:5px"								id="inputDiv">
								
								<div class="form-group " style="margin-bottom: 8px;">
									<div class="col-md-1 control-label cm_tr"
										style="padding-top:10px;font-size: 14px;">
										用户口令<font style="color:red">*</font>：
									</div>
									<div class="col-md-5 cm_tr">
										<input type="text" id="token" name="token" value="UJDEK0SX9DNG9NGZDZZ4DIO3PN3M71D2"
											class="form-control" placeholder="请输入用户口令">
									</div>
									 
								</div>
								
								<div class="form-group " style="margin-bottom: 8px;">
									<div class="col-md-1 control-label cm_tr"
										style="padding-top:10px;font-size: 14px;">
										地址 <font style="color:red">*</font>：
									</div>
									<div class="col-md-11 cm_tr">
										<input type="text" id="url" name="url"
											class="form-control" value="/hospital/newWorkInfos.htm"  >
									</div>
									 
								</div>
								 
								<div class="form-group " style="margin-bottom: 8px;">
									<div class="col-md-1 control-label cm_tr"
										style="padding-top:10px;font-size: 14px;">输入参数 ：</div>
									<div class="col-md-11 cm_tr">
											<textarea placeholder="输入json参数" id="paramText"
											 class="form-control"
											  style="height:180px">[{  "shiftPeriodId": 8,  "departmentId":5,  "doctorId":5,  "planDate": "2015-09-01",  "planCount": 5}]</textarea>
			                    		
									</div>
									 
								</div>
								
								
							</div>
						</div>
					</div>
			       </div>
			       <div id="listDiv"></div>
			       <div class="row" style="height:8px;">&nbsp;</div>
			       <div class="row" id="resultDiv">
			            <div class="col-md-12">
			                <div class="ibox float-e-margins" style="margin-bottom:0px">
				                <!-- 表单标题区域begin -->
						            <div class="ibox-title" style="border-width: 1px 0px 0">
				                        <h3 style="color:#034392"><li class="fa fa-info"></li>&nbsp;&nbsp;返回结果</h3>
				                    	<div class="ibox-tools">
											<a class="btn-sm btn-success" href="javascript:save()" style="color:#fff"><i class="fa fa-check"></i>&nbsp;提交</a>
				                     	</div>
						            </div>
				                <!-- 表单标题区域end -->
			                    <div class="ibox-content" style="padding-bottom:5px">
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
	</body> 
</html>
<<script type="text/javascript">
 function  save(){
 
  		var token=$("#token").val();
		var openId = $("#openId").val();
		var url = $("#url").val();
		var str=$("#paramText").val();
		if((token!=null && token!="") || (openId!=null && openId!="")){
			$.ajax({
				  type: 'POST',
				  headers: {
				  "Accept": "application/json",
		        	"Content-Type": "application/json",
				        "token": token,
				        "openId": openId
				   }, 
		    contentType:"application/json;charset=UTF-8",
				  url: "/angeldoctor"+url+"?",
				  data:str,
				  
		  dataType: "json",
				  success: function(data) {  
			          $("#resultText").val(formatJson(data));
			        }  
			});
			}
 }
 
 
function formatJson(json, options) {
            var reg = null,
              formatted = '',
              pad = 0,
              PADDING = '    '; // one can also use '\t' or a different number of spaces
            // optional settings
            options = options || {};
            // remove newline where '{' or '[' follows ':'
            options.newlineAfterColonIfBeforeBraceOrBracket = (options.newlineAfterColonIfBeforeBraceOrBracket === true) ? true : false;
            // use a space after a colon
            options.spaceAfterColon = (options.spaceAfterColon === false) ? false : true;

            // begin formatting...

            // make sure we start with the JSON as a string
            if (typeof json !== 'string') {
                json = JSON.stringify(json);
            }
            // parse and stringify in order to remove extra whitespace
            json = JSON.parse(json);
            json = JSON.stringify(json);

            // add newline before and after curly braces
            reg = /([\{\}])/g;
            json = json.replace(reg, '\r\n$1\r\n');

            // add newline before and after square brackets
            reg = /([\[\]])/g;
            json = json.replace(reg, '\r\n$1\r\n');

            // add newline after comma
            reg = /(\,)/g;
            json = json.replace(reg, '$1\r\n');

            // remove multiple newlines
            reg = /(\r\n\r\n)/g;
            json = json.replace(reg, '\r\n');

            // remove newlines before commas
            reg = /\r\n\,/g;
            json = json.replace(reg, ',');

            // optional formatting...
            if (!options.newlineAfterColonIfBeforeBraceOrBracket) {
                reg = /\:\r\n\{/g;
                json = json.replace(reg, ':{');
                reg = /\:\r\n\[/g;
                json = json.replace(reg, ':[');
            }
            if (options.spaceAfterColon) {
                reg = /\:/g;
                json = json.replace(reg, ': ');
            }

            $.each(json.split('\r\n'), function(index, node) {
                var i = 0,
                  indent = 0,
                  padding = '';

                if (node.match(/\{$/) || node.match(/\[$/)) {
                    indent = 1;
                } else if (node.match(/\}/) || node.match(/\]/)) {
                    if (pad !== 0) {
                        pad -= 1;
                    }
                } else {
                    indent = 0;
                }

                for (i = 0; i < pad; i++) {
                    padding += PADDING;
                }

                formatted += padding + node + '\r\n';
                pad += indent;
            });

            return formatted;
        };
 
 
 
 
 
 
</script>
 
