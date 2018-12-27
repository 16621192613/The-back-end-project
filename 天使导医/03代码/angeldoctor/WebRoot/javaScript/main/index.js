var setting;
var selParam;
var listParams=[];
var paramList=[];
$(function(){ 
	for(var i=0;i<paramJs.length;i++){
		$.getJSON("/angeldoctor/javaScript/dataList/"+paramJs[i]+"?",function(data) {
			   if(data != null && data.length >0){
				   for(var i=0;i < data.length;i++)
					   paramList.push(data[i]);
			   }
			});
	}
	
	
	
	initTree();
});
function initTree(){
	//设置树形数据开始
	setting = {
		data: {
		        simpleData: {
			        enable:true,
			        idKey: "id",
			        pIdKey: "pId",
			        isParent: "isParent"
		       	}
	       },
		  callback: {//增加点击事件
            	beforeClick: function(treeId, treeNode) {
            		if(treeNode.id!=0)
            			initInput(treeNode.id);
	            }
	        }
        };
	$.fn.zTree.init($("#tree"), setting, zNodes);  
	//自动展现第一层树
	var zTree = $.fn.zTree.getZTreeObj("tree"); 
	var node = zTree.getNodesByParam("id","0");
	lastExpandNode=node;
	zTree.expandNode(node[0],  true, false, false); 
	
}
//设置数据的展现形式 
function filter(treeId, parentNode, childNodes) {  
	if (!childNodes) return null;  
	for (var i=0, l=childNodes.length; i<l; i++) {  
		childNodes[i].name = childNodes[i].name.replace('','');  
	}  
	return childNodes;  
} 

function initInput(jkcode){
	$("#inputDiv").html("");
	$("#jkmsDiv").html("");
	$("#listDiv").html("");
	$("#resultText").val("");
	selParam={};
	listParams=[];
	for(var i=0;i <paramList.length;i++){
		if(jkcode==paramList[i].code){
			var data = paramList[i];
			selParam=data;
			var content = data.content;
			$("#jkmsDiv").html(content?content:"");
			var pars=data.param;
			var str= initInputDiv(pars);
			$("#inputDiv").html(str?str:"");
			if(listParams !=null && listParams.length >0){
				for(var j=0;j < listParams.length;j++){
					var listStr="<div class=\"row\" style=\"height:8px;\">&nbsp;</div>";
					listStr += "<div class=\"row\"><div class=\"col-md-12\">"
							+"<div class=\"ibox float-e-margins\" style=\"margin-bottom:0px\">"
							+"<div class=\"ibox-title\" style=\"border-width: 1px 0px 0\">"
							+"<h3 style=\"color:#034392\"><li class=\"fa fa-desktop\"></li>"
							+"&nbsp;&nbsp;"+listParams[j].title+"</h3>"
							+"<div class=\"ibox-tools\" >"
							+"<a class=\"btn-sm btn-success\" href=\"javascript:addItem('"+listParams[j].name+"')\" style=\"color:#fff\"><i class=\"fa fa-plus\"></i>&nbsp;增加</a>"
							+"</div></div><div class=\"ibox-content\" style=\"padding-bottom:5px\" id=\""+listParams[j].name+"Div\">"
							+"</div></div></div></div>";
					$("#listDiv").append(listStr);
					var str2= initInputDiv(listParams[j].param,true);
					$("#"+listParams[j].name+"Div").html(str2);
				}
			}
		}
	}
}

function save(){
	if(selParam !=null){
		var str="1=1";
		var params= selParam.param;
		if(params !=null && params.length>0){
			for(var i=0;i < params.length;i++){
				var param = params[i];
				if(param.isList ==null || param.isList ==false){
					var required = param.isRequired;//是否必输
					var checkType = param.dataType;//输入的数据格式
					var titel = param.title;//标题
					var name = param.name;//id
					var inputValue=$("#"+name).val();
					if(required && (inputValue==null || $.trim(inputValue) =="")){
						alert("请输入"+titel+"！");
						return;
					}
					if(checkType!=null && inputValue!=null && $.trim(inputValue) !=""){
						if(!checkData(checkType,inputValue,titel))
							return ;
					}
						
					if(inputValue!=null && $.trim(inputValue) !="")
						str+="&"+name+"="+$.trim(inputValue);
				}
			}
		
		}
		if(listParams !=null && listParams.length >0){
			for(var i=0;i < listParams.length;i++){
				var pname=listParams[i].name;
				var ps= listParams[i].param;
				//获取
				var inpDivs= $("#"+pname+"Div").children();
				var pinp="";
				for(var j=0;j < inpDivs.length;j++){
					var inpObj="";
					for(var k=0;k < ps.length;k++){
						var required = ps[k].isRequired;//是否必输
						var checkType = ps[k].dataType;//输入的数据格式
						var titel = ps[k].title;//标题
						var name = ps[k].name;//id
						var inputValue=$(inpDivs[j]).find($("input[name='"+name+"']")).val();
						if(required && (inputValue==null || $.trim(inputValue) =="")){
							alert("请输入"+titel+"！");
							return;
						}
						if(checkType!=null && inputValue!=null && $.trim(inputValue) !=""){
							if(!checkData(checkType,inputValue,titel))
								return ;
						}
						if(inputValue!=null && $.trim(inputValue) !="")
							inpObj+=name+":\""+$.trim(inputValue)+"\",";
					}
					if(inpObj!=null && inpObj!=""){
						inpObj=inpObj.substring(0,inpObj.length-1);
						inpObj="{"+inpObj+"}";
						pinp+=inpObj+",";
					}
				}
				
				if(pinp!=null && pinp!=""){
						pinp=pinp.substring(0,pinp.length-1);
						pinp="["+pinp+"]";
						str+="&"+pname+"="+pinp;
				}
			}
		}
		
		var token=$("#token").val();
		var openId = $("#openId").val();
		if((token!=null && token!="") || (openId!=null && openId!="")){
			$.ajax({
				  type: 'POST',
				  headers: {
				        "token": token,
				        "openId": openId
				   },
				  url: "/angeldoctor"+selParam.url+"?",
				  data:str,
				  success: function(data) {  
			          $("#resultText").val(formatJson(data));
			        }  
			});
		}else{
			$.ajax({
				  type: 'POST',
				  url: "/angeldoctor"+selParam.url+"?",
				  data:str,
				  success: function(data) {  
			          $("#resultText").val(formatJson(data));
			        }  
			});
		}
		
  
	}
}



function initInputDiv(pars,isDel){
	var str="";
	if(pars != null && pars.length>0){
		var k=-1;
		for(var j=0;j < pars.length;j++){
			var parData = pars[j];
			if(parData.isList !=null && parData.isList){
				listParams.push(parData);
			}else{
				k++;
				if(k==0)
					str+="<div class=\"form-group \" style=\"margin-bottom: 8px;\">";
				else if(k%2==0)
					str+="</div><div class=\"form-group \" style=\"margin-bottom: 8px;\">";
				var bsstr="";
				var required="";
				if(parData.isRequired!=null && parData.isRequired==true){
					bsstr="<font style=\"color:red\">*</font>";
				}
				str +="<div class=\"col-md-1 control-label cm_tr\" style=\"padding-top:10px;font-size: 14px;\">"
					+parData.title+bsstr+"：</div><div class=\"col-md-5 cm_tr\">";
				str +="<input type=\"text\" id=\""+parData.name+"\" name=\""+parData.name+"\" class=\"form-control\" "
					+"placeholder=\""+parData.name+"\" ></div>";
			}
			
		}
		if(str !=null && str !=""){
			str+="</div>";
			if(isDel!=null && isDel==true){
				str+="<div class=\"form-group \" style=\"margin-bottom: 8px;\">"
					+"<div class=\"col-md-11 cm_tr\"></div><div class=\"col-md-1 cm_tr\">"
					+"<a class=\"btn-sm btn-danger\" onclick=\"delItem(this)\" style=\"color:#fff\"><i class=\"fa fa-minus\"></i>&nbsp;删除</a>";
				str+="</div></div>";
				str ="<div>"+str+"</div>";
			}
		}
			
	}
	return str;
}

function addItem(divName){
	for(i=0;i < listParams.length;i++){
		if(listParams[i].name == divName){
			var str2= initInputDiv(listParams[i].param,true);
			$("#"+divName+"Div").append(str2);
			break;
		}
	}
}

function delItem(obj){
	var top = $(obj).parent().parent().parent();
	var siblings = top.siblings();
	if(siblings!=null && siblings.length >0 )
		$(obj).parent().parent().parent().remove();
}

function checkData(checkType,inputValue,titel){
	inputValue=$.trim(inputValue);
	if("isDigit"==checkType){
		lb_back=CheckUtil.isDigit(inputValue);
		if(lb_back==false){
			alert(titel+"必须是数字！");
			return false;
		}
	}else if("isPlusFloat"==checkType){
		lb_back=CheckUtil.isPlusFloat(inputValue);
		if(lb_back==false){
			alert(titel+"必须是正浮点数！");
			return false;
		}
	}else if("isInteger"==checkType){
		lb_back=CheckUtil.isInteger(inputValue);
		if(lb_back==false){
			alert(titel+"必须是整数！");
			return ;
		}						
	}else if("isPlusInteger"==checkType){
		lb_back=CheckUtil.isPlusInteger(inputValue);
		if(lb_back==false){
			alert(titel+"必须是正整数！");
			return false;
		}						
	}else if("isMobile"==checkType){
		lb_back=CheckUtil.isMobile(inputValue);
		if(lb_back==false){
			alert(titel+"必须是手机号！");
			return ;
		}						
	}else if("isEmail"==checkType){
		lb_back=CheckUtil.isEmail(inputValue);
		if(lb_back==false){
			alert(titel+"必须是邮件地址！");
			return false;
		}						
	}else if("isIP"==checkType){
		lb_back=CheckUtil.isIP(inputValue);
		if(lb_back==false){
			alert(titel+"必须是ip地址！");
			return false;
		}						
	}else if("isDate"==checkType){
		lb_back=CheckUtil.isDate(inputValue);
		if(lb_back==false){
			alert(titel+"必须是yyyy-MM-dd！");
			return false;
		}						
	}else if("isDateTime"==checkType){
		lb_back=CheckUtil.isDateTime(inputValue);
		if(lb_back==false){
			alert(titel+"必须是yyyy-MM-dd hh:mm:ss！");
			return false;
		}						
	}else if("isTime"==checkType){
		lb_back=CheckUtil.isTime(inputValue);
		if(lb_back==false){
			alert(titel+"必须是hh:mm:ss！");
			return false;
		}						
	}
	return true;
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