package com.hsk.xframe.api.im;

import java.util.Map;

import com.hsk.supper.until.json.JsonUtil;
import com.hsk.xframe.api.im.api.impl.EasemobIMUsers;

import io.swagger.client.model.RegisterUsers;
import io.swagger.client.model.User;

public class IMUtile {
	
	private EasemobIMUsers easemobIMUsers = new EasemobIMUsers();
	
	 public void createUser(String userName,String password) {
	        RegisterUsers users = new RegisterUsers();
	        User user = new User().username(userName).password(password);
	        users.add(user);
	        Object result = easemobIMUsers.createNewIMUserSingle(users);
	        System.out.println(result.toString());
	}
	 
	public boolean getIMUserStatus(String userName){
		 boolean isOnLine=false;
		 Object result = easemobIMUsers.getIMUserStatus(userName);
		 if(result!= null){
			 Map<String,Object> objMap = JsonUtil.getMap4Json(result.toString());
			 if(objMap.containsKey("data")){
				 Map<String,Object> dataMap = (Map<String, Object>) objMap.get("data");
				 if(dataMap.containsKey(userName) && dataMap.get(userName).equals("online"))
					 isOnLine=true;
			 }
		 }
		 return isOnLine;
	 }
	 public boolean checkIMUserByUserName(String userName){
		 boolean isExist=false;
		 Object result = easemobIMUsers.getIMUserByUserName(userName);
		 if(result!=null)
			 isExist=true;
		 return isExist;
		 
	 }
	
	public static void main(String[] args){
		IMUtile iMUtile = new IMUtile();
		iMUtile.createUser("hisforce_patient_2", "HisforceBeershebaPatient");
		//System.out.println(iMUtile.getIMUserStatus("zhangshu_test002"));
		//System.out.println(iMUtile.checkIMUserByUserName("zhangshu_test002"));
	}

}
