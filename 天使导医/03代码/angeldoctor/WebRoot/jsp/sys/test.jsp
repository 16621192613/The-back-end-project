<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<!DOCTYPE HTML> 
<html>
	<head>

		<title>天使导医</title>
		<meta charset="utf-8">
		<%@ include file="/jsp/lib.jsp"%>
		<%@ include file="/jsp/link.jsp"%>
	</head>
<body >
	 2222
		<a style="top:153px;margin-left:65px;width:240px;" href="javascript:loginS();"  >登录</a>
				 
</body>

</html>
<script> 
function  loginS(){ 
		 var userArr = [];
    for (var i = 1; i <= 3; i++) {
        var user = {};
        user['id'] = i;
        user['name'] = 'name_' + i;
        userArr.push(user)
    }

    console.log(JSON.stringify(userArr));
    
    
     $.ajax({
            // headers必须添加，否则会报415错误
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "post",
            data: JSON.stringify(userArr),
            url: "<c:url value='/testList.htm' />",
            async: true,
            dataType: "json",
            beforeSend: function () {

            },
            success: function (result) {
				alert("111111111");
            },
            error: function () {

            }
        });
     	
}

</script>
