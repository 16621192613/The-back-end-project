package com.hsk.xframe.api.timing;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.hsk.angeldoctor.api.daobbase.IAgIntegralInfoDao;
import com.hsk.angeldoctor.api.daobbase.IAgMoneyCountDao;
import com.hsk.angeldoctor.api.daobbase.IAgOrderInfoDao;
import com.hsk.angeldoctor.api.persistence.AgMoneyCount;

public class Timing {
	
	@Autowired
	protected IAgMoneyCountDao agMoneyCountDao;
	@Autowired
	protected IAgIntegralInfoDao agIntegralInfoDao;
	@Autowired
	private IAgOrderInfoDao agOrderInfoDao;
	/**
	 * 计算前一天的积分排名
	 */
	public void previousRanking(){
		try{
			AgMoneyCount att_AgMoneyCount=new AgMoneyCount();
			List<AgMoneyCount> countList = agMoneyCountDao.getListByAgMoneyCount(att_AgMoneyCount);
			if(countList!=null && countList.size() >0){
				List<Map<String,Object>> rankingList = agMoneyCountDao.getIntegralRanking();
				if(rankingList !=null && rankingList.size() >0){
					for(AgMoneyCount count : countList){
						int i=0;
						for(Map<String,Object> ranking : rankingList){
							i++;
							if(ranking.get("integral_count").toString().equals(count.getIntegralCount().toString())){
								count.setPreviousRanking(i);
								agMoneyCountDao.saveOrUpdateAgMoneyCount(count);
								break;
							}
						}
					}
					
				}
			}
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			agOrderInfoDao.updateOrderOver(sdf.format(new Date()));
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
