$(function(){
	createMenu();
	getUserControl();
	$('.J_menuItem').on('click', menuItem);
	$('.J_menuTabs').on('click', '.J_menuTab i', closeTab);
	$('.J_tabCloseOther').on('click', closeOtherTabs);
	$('.J_tabShowActive').on('click', showActiveTab);
	$('.J_menuTabs').on('click', '.J_menuTab', activeTab);
	$('.J_menuTabs').on('dblclick', '.J_menuTab', refreshTab);

    // 左移按扭
    $('.J_tabLeft').on('click', scrollTabLeft);

    // 右移按扭
    $('.J_tabRight').on('click', scrollTabRight);

    // 关闭全部
    $('.J_tabCloseAll').on('click', function () {
        $('.page-tabs-content').children("[data-id]").not(":first").each(function () {
            $('.J_iframe[data-id="' + $(this).data('id') + '"]').remove();
            $(this).remove();
        });
        $('.page-tabs-content').children("[data-id]:first").each(function () {
            $('.J_iframe[data-id="' + $(this).data('id') + '"]').show();
            $(this).addClass("active");
        });
        $('.page-tabs-content').css("margin-left", "0");
    });
    
});

function createMenu(){
	$.supper("doservice", {"service":"SysUserService.getSysUserMenuList","BackE":function (jsondata) {
		if (jsondata.code == "1") {
			if(jsondata.obj.length > 0){
				var str = "";
				for(var i =0;i < jsondata.obj.length;i++){
					str +="<li><a href=\"#\"><i class=\"fa "+jsondata.obj[i].icon+"\"></i><span class=\"nav-label\">"+jsondata.obj[i].name
						+"</span><span class=\"fa arrow\"></span></a>";
					if(jsondata.obj[i].child != null)
						str += initMenu(jsondata.obj[i].child);
					str += "</li>";
				}
				$("#side-menu").append(str);
			}
			$('#side-menu').metisMenu();
			$('.J_menuItem').on('click', menuItem);
			
		}
 	}});
}

function getUserControl(){
	$.supper("doservice", {"service":"SysUserService.getSysUserControlList","BackE":function (jsondata) {
		if (jsondata.code == "1") {
			$.supper("setProductArray", {"name":"UserControlList", "value":jsondata.obj});
		}
 	}});
}
//
function initMenu(data){
	var str = "<ul class=\"nav nav-second-level\">";
	for(var i =0;i < data.length;i++){
		str+= "<li> ";
		if(data[i].menuType=='4'){
			str+="<a  href=\""+data[i].filePath+"\" target=\"_blank\" data-index=\"0\">";
		}else if(data[i].menuType=='3'){
			str+="<a  href=\"/angeldoctor/jsp/sys/sysinfo/viewMedio.jsp?filePath="+data[i].filePath+"\" target=\"_blank\" data-index=\"0\">";
		}else
			str+="<a class=\"J_menuItem\" href=\"/angeldoctor"+data[i].address+"\" data-index=\"0\">";
		str +="<i class=\"fa "+data[i].icon+"\"></i>"+data[i].name;
		if(data[i].child != null)
			str +="<span class=\"fa arrow\"></span>";
		str += "</a>";
		if(data[i].child != null)
			str += initMenu(data[i].child);
		str += "</a></li>";
		
	}
	str += "</ul>";
	
	return str;
}

function addMenuItem(dataUrl,menuName) {
    // 获取标识数据
    var flag = true;
    var dataIndex = 100;
    if (dataUrl == undefined || $.trim(dataUrl).length == 0)return false;

    // 选项卡菜单已存在
    $('.J_menuTab').each(function () {
        if ($(this).data('id') == dataUrl) {
        	$(this).remove();
            
        }
    });

    // 选项卡菜单不存在

        var str = '<a href="javascript:;" class="active J_menuTab" data-id="' + dataUrl + '">' + menuName + ' <i class="fa fa-times-circle"></i></a>';
        $('.J_menuTab').removeClass('active');

        // 添加选项卡对应的iframe
        var str1 = '<iframe class="J_iframe" name="iframe' + dataIndex + '" width="100%" height="100%" src="' + dataUrl + '" frameborder="0" data-id="' + dataUrl + '" seamless></iframe>';
        $('.J_mainContent').find('iframe.J_iframe').hide().parents('.J_mainContent').append(str1);

        //显示loading提示
        var loading = layer.load();

        $('.J_mainContent iframe:visible').load(function () {
            //iframe加载完成后隐藏loading提示
            layer.close(loading);
        });
        // 添加选项卡
        $('.J_menuTabs .page-tabs-content').append(str);
        scrollToTab($('.J_menuTab.active'));
    return false;
}

function loginOut(){
	$.supper("doservice", {"service":"SysLoginService.ReceptionCancellation", "BackE":function (jsondata) {
		window.location.href = "admin.htm";
	}});
}

function updatePass(){
	var att_url = "";
	var att_url= $.supper("getServicePath", {url:"/jsp/sys/sysuser/updatePass"});
	var tt_win=$.supper("showWin",{url:att_url,width:600,height:400,icon:"fa fa-user",title:"更改密码"}); 
}

function editUser(suiId){
	var data = "suiId="+suiId; 
	var att_url= $.supper("getServicePath", {"service":"SysUserService.findSysUser", "data":data,url:"/jsp/sys/sysuser/editMyInfo"});
	var tt_win=$.supper("showWin",{url:att_url,title:"用户信息",icon:"fa-group",width:800,height:500}); 
}

function onkeydowns(){ 
	var all_win_index_array = $.supper("getProductArray", "all_win_index_array");	
	if($.isEmptyObject(all_win_index_array)){
		var index = top.window.layer.getFrameIndex(window.name); //获取窗口索引 
		if(index){
			top.window.parent.layer.close(index);
		}
		return ;
	} 
	var index = all_win_index_array.pop();
	top.window.parent.layer.close(index);
	 $.supper("setProductArray", {"name":"all_win_index_array", "value":all_win_index_array});
	
}



function updateHeard(){
	var att_url= $.supper("getServicePath", {url:"/jsp/sys/sysuser/updateHeard.jsp"});
	var tt_win=$.supper("showWin",{url:att_url,width:600,height:600,BackE:showHeard,icon:"fa fa-user",title:"头像上传"}); 
}

function showHeard(){
	$.supper("doservice", {"service":"SysUserService.showHeard", "BackE":function (jsondata) {
		if (jsondata.code == "1") {
			if(jsondata.obj != null && jsondata.obj != '')
				$("#heardImg").attr('src',jsondata.obj); 
			else
				$("#heardImg").attr('src',"img/tou.png"); 
		}
	}});
}