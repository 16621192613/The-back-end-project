var _valId;
var _divId;
var _listId;
var _listDivId;
function initOneUploadImg(valId,divId,isView){
    var imgCode = $("#"+valId).val();
	if(imgCode == null || imgCode == ""){
		if(isView != null && isView=='1'){}
		else{
			str = "<p class=\"add\" id=\""+valId+"_add\"></p><input type=\"file\" id=\""+valId+"_file\" class=\"butyfile\" onchange=\"submitOneFile(this,'"+valId+"','"+divId+"')\" value=\"浏览\" /></div>";
			$("#"+divId).html(str);
			$("#"+divId).addClass("addLi");
		}
	}else{
		$.supper("doservice", {"service":"FileService.GetOneFileInfo", "data":"fileCode=" + imgCode, "BackE":function (jsondata) {
			if (jsondata.code == "1") {
		    	 initOneImgData(jsondata.obj,valId,divId,isView);
			}
		}});
	}
}
function openSelImgFile(valId){
	$("#"+valId+"_file").trigger("click"); 
}
function submitOneFile(file,valId,divId){
	_valId = valId;
	_divId = divId;
	var form = new FormData();
	form.append('file', file.files[0]);
	var xhr = new XMLHttpRequest();
	var att_upfile_url = $.supper('getServicePath', {
		"service" : "FileService.addfile"
	});
	xhr.open("POST", att_upfile_url);
	xhr.addEventListener("load",fileOneImgUploadSuccess , false);
    xhr.send(form);//上传文件
}

function deleteOneImg(fileCode,fileId,valId,divId){
	$.supper("doservice", {"service":"FileService.deletefile", "data":"fileCode=" + fileCode, "BackE":function (jsondata) {
		if (jsondata.code == "1") {
	    	 str = "<p class=\"add\" id=\""+valId+"_add\"></p><input type=\"file\" id=\""+valId+"_file\" class=\"butyfile\" onchange=\"submitOneFile(this,'"+valId+"','"+divId+"')\" value=\"浏览\" /></div>";
			 $("#"+divId).html(str);
			 $("#"+divId).addClass("addLi");
			 $("#"+valId+"_add").attr("onclick","openSelImgFile('"+valId+"')");
			 $("#"+valId).val("");
		}
	}});
}

function fileOneImgUploadSuccess(evt){
	var jsondata = JSON.parse(evt.target.responseText); 
	if(jsondata.code=='1'){
		initOneImgData(jsondata.obj,_valId,_divId);
	}
}

function initOneImgData(data,valId,divId,isView){
	var str = "<img src="+data.rootPath+" >";
	if(isView != null && isView=='1'){}
	else
		str +="<a href=\"javascript:deleteOneImg('"+data.fileCode+"','"+data.fileId+"','"+valId+"','"+divId+"')\" class=\"imgdel\"></a>";
	$("#"+divId).html(str);
	$("#"+divId).removeClass("addLi");
	$("#"+valId).val(data.fileCode);
}


function initListUploadImg(listId,listDivId,isView){
	if(isView != null && isView=='1'){}
	else{
		var str = "<li class =\"addLi\"><p class=\"add\"></p>"
			+"<input type=\"file\" class=\"butyfile\" value=\"浏览\" onchange=\"submitListFile(this,'"+listId+"','"+listDivId+"')\"/></li>";
		$("#"+listDivId).html(str);
	}
	var listIds = $("#"+listId).val();
	if(listIds != null && listIds != ""){
		$.supper("doservice", {"service":"FileService.GetListFileInfo", "data":"fileCodes=" + listIds, "BackE":function (jsondata) {
			if (jsondata.code == "1") {
				 for(var i =0;i < jsondata.obj.length ;i++)
					 initListImgData(jsondata.obj[i],listId,listDivId,'1',isView);
			}
		}});
	}
}

function submitListFile(file,listId,listDivId){
	_listId = listId;
	_listDivId = listDivId;
	var form = new FormData();
	form.append('file', file.files[0]);
	var xhr = new XMLHttpRequest();
	var att_upfile_url = $.supper('getServicePath', {
		"service" : "FileService.addfile"
	});
	xhr.open("POST", att_upfile_url);
	xhr.addEventListener("load",fileUploadListSuccess , false);
    xhr.send(form);//上传文件
}

function deleteListImgs(fileCode,fileId,listId,listDivId){
	$.supper("doservice", {"service":"FileService.deletefile", "data":"fileCode=" + fileCode, "BackE":function (jsondata) {
		if (jsondata.code == "1") {
	    	 $("#"+fileCode).remove();
	    	 var listVal = $("#"+listId).val()+",";
	    	 listVal = listVal.replace(fileCode+",","");
	    	 if(listVal != null && listVal != "")
	    	 	listVal = listVal.substring(0,listVal.length -1);
	    	 $("#"+listId).val(listVal);
		}
	}});
}

function fileUploadListSuccess(evt){
	var jsondata = JSON.parse(evt.target.responseText); 
	if(jsondata.code=="1")
		initListImgData(jsondata.obj,_listId,_listDivId);
}

function initListImgData(data,listId,listDivId,isInit,isView){
	var str = "<li id='"+data.fileCode+"'><img src="+data.rootPath+" >";
	if(isView != null && isView=='1'){
	}
	else
		str += "<a href=\"javascript:deleteListImgs('"+data.fileCode+"','"+data.fileCode+"','"+listId+"','"+listDivId+"')\" class=\"imgdel\"></a>";
	str += "</li>";
	str += $("#"+listDivId).html();
	$("#"+listDivId).html(str);
	if(isInit != null && isInit=='1'){
	}
	else{
		var listVal = $("#"+listId).val();
		if(listVal==null || listVal=="")
			listVal += data.fileCode;
		else
			listVal += ","+data.fileCode;
		$("#"+listId).val(listVal);
	}
}