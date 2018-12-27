<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
<script src="jquery.js"></script>
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	 

  </head>
  
  <body>
    This is my JSP page. <br>
 <br/><hr/>

<a href="javascript:loginS();">loginS</a>


<br/><hr/>

<a href="javascript:test002();">add</a>

</body>
</html>

<script> 

function  test002(){ 
	
	var testList=[];
		var user={};
		user.id=1;
		user.name='jack';
		testList.push(user);
		var user2={};
		user2.id=2;
		user2.name='tom';
		testList.push(user2);
		$.ajax({
		    
		    headers: {
		        'Accept': 'application/json',
		        'Content-Type': 'application/json',
		        
		    },
		    contentType: 'application/json;charset=UTF-8',
		  type: 'POST',
		  dataType: "json",  
		  data: JSON.stringify(user2),
		  url: 'add.htm',
		  success: function(){
		      alert('success');
		  }
		  
		});
	


}

// headers必须添加，否则会报415错误
function  loginS(){ 
		 var testList=[];
		var user={};
		user.id=1;
		user.name='jack';
		testList.push(user);
		var user2={};
		user2.id=2;
		user2.name='tom';
		testList.push(user2);
		$.ajax({
		    
		    headers: {
		        'Accept': 'application/json',
		        'Content-Type': 'application/json',
		        
		    },
		    contentType: 'application/json;charset=UTF-8',
		  type: 'POST',
		  dataType: "json",  
		  data: JSON.stringify(testList),
		  url: 'get11.htm',
		  success: function(){
		      alert('success');
		  }
		  
		});
     	
}

</script>
