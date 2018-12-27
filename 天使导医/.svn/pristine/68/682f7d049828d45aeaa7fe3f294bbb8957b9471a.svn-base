package com.hsk.angeldoctor.web.operate.thread;

import com.hsk.angeldoctor.web.operate.service.IAgNewsInfoService;
import com.hsk.supper.dto.SystemContext;

/**
 * 发送信息的thread
 * @author Administrator
 *
 */
public class NewsRunnable implements Runnable {
	
	private IAgNewsInfoService agNewsInfoService;
	private String title;
	private String body;
	
	public NewsRunnable(String title,String body){
		agNewsInfoService = (IAgNewsInfoService)SystemContext.getBean("agNewsInfoService"); 
		this.title=title;
		this.body=body;
		
	}
	
	@Override
	public void run() {
		try {
			agNewsInfoService.saveAllNews(title, body);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
