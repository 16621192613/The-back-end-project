package com.hsk.xframe.api.utils.freeMarker;

import java.util.Map;

import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

public class SendSms {
	
	private static String verification_code="【天使导医】您的短信验证码是code,在30分钟内输入有效。";
	
	private static String notice_info="【天使导医】尊敬的userName您好，您已通过天使导医成功预约hosName，就诊时间orderTime。祝您早日康复！";
	/**
	 * 发送短信验证码
	 * @param mobile
	 * @param code
	 * @return
	 */
	public static boolean sendSmsVerification( String mobile, String code) {
	    //初始化client,apikey作为所有请求的默认值(可以为空)
	    YunpianClient clnt = new YunpianClient(CommonUtil.SMS_KEY).init();

	    Map<String, String> param = clnt.newParam(2);
	    param.put(YunpianClient.MOBILE, mobile);
	    param.put(YunpianClient.TEXT, verification_code.replace("code", code));
	    Result<SmsSingleSend> r = clnt.sms().single_send(param);
	    //获取返回结果，返回码:r.getCode(),返回码描述:r.getMsg(),API结果:r.getData(),其他说明:r.getDetail(),调用异常:r.getThrowable()
	    r.getData();
	    boolean isFlag=false;
	    if(r.getCode()==0){
	    	isFlag=true;
	    }
	    //账户:clnt.user().* 签名:clnt.sign().* 模版:clnt.tpl().* 短信:clnt.sms().* 语音:clnt.voice().* 流量:clnt.flow().* 隐私通话:clnt.call().*

	    //最后释放client
	    clnt.close();
	    return isFlag;
	}
	/**
	 * 发送通知信息
	 * @param mobile
	 * @param userName
	 * @param hosName
	 * @param orderTime
	 * @return
	 */
	public static boolean sendNoticeInfo( String mobile, String userName,String hosName,String orderTime) {
	    //初始化client,apikey作为所有请求的默认值(可以为空)
	    YunpianClient clnt = new YunpianClient(CommonUtil.SMS_KEY).init();

	    Map<String, String> param = clnt.newParam(2);
	    param.put(YunpianClient.MOBILE, mobile);
	    param.put(YunpianClient.TEXT, notice_info.replace("userName", userName).replace("hosName", hosName).replace("orderTime", orderTime));
	    Result<SmsSingleSend> r = clnt.sms().single_send(param);
	    //获取返回结果，返回码:r.getCode(),返回码描述:r.getMsg(),API结果:r.getData(),其他说明:r.getDetail(),调用异常:r.getThrowable()
	    r.getData();
	    boolean isFlag=false;
	    if(r.getCode()==0){
	    	isFlag=true;
	    }
	    //账户:clnt.user().* 签名:clnt.sign().* 模版:clnt.tpl().* 短信:clnt.sms().* 语音:clnt.voice().* 流量:clnt.flow().* 隐私通话:clnt.call().*

	    //最后释放client
	    clnt.close();
	    return isFlag;
	}
	//发送短信
	public static boolean sendSms(String mobile, String text){
		 //初始化client,apikey作为所有请求的默认值(可以为空)
	    YunpianClient clnt = new YunpianClient(CommonUtil.SMS_KEY).init();

	    Map<String, String> param = clnt.newParam(2);
	    param.put(YunpianClient.MOBILE, mobile);
	    param.put(YunpianClient.TEXT, text);
	    Result<SmsSingleSend> r = clnt.sms().single_send(param);
	    //获取返回结果，返回码:r.getCode(),返回码描述:r.getMsg(),API结果:r.getData(),其他说明:r.getDetail(),调用异常:r.getThrowable()
	    r.getData();
	    boolean isFlag=false;
	    if(r.getCode()==0)
	    	isFlag=true;
	    //账户:clnt.user().* 签名:clnt.sign().* 模版:clnt.tpl().* 短信:clnt.sms().* 语音:clnt.voice().* 流量:clnt.flow().* 隐私通话:clnt.call().*

	    //最后释放client
	    clnt.close();
	    return isFlag;
	}
	
	public static void main(String[] args){
		//sendSmsVerification("15391936038","2222");
		System.out.println(sendNoticeInfo("15391936038","张曙","昆山同济口腔医院-牙周科","2017-08-16 09:30-10:00"));
	}

}
