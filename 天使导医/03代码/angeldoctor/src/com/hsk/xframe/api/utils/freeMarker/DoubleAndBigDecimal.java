package com.hsk.xframe.api.utils.freeMarker;

import java.math.BigDecimal;

/*
 * 
 * 
 * 解决       double  类 型 计 算 过 程 中 出 错 的 问 题
 * 
 * 
 * */
public class DoubleAndBigDecimal {
	
	//加法
	public static double add(double a,double b){
        BigDecimal d1 = new BigDecimal(Double.toString(a));
        BigDecimal d2 = new BigDecimal(Double.toString(b));
        return d1.add(d2).doubleValue();    
    }
	
	//减法
	public static double sub(double a,double b){
        BigDecimal d1 = new BigDecimal(Double.toString(a));
        BigDecimal d2 = new BigDecimal(Double.toString(b));
        return d1.subtract(d2).doubleValue();
    }
 
	//乘法
	public  static double mul(double a,double b){
	        BigDecimal d1 = new BigDecimal(Double.toString(a));
	        BigDecimal d2 = new BigDecimal(Double.toString(b));
	        return d1.multiply(d2).doubleValue();
	}
	//除法
	public static double div(double a,double b,int scale,int roundingMode){
        BigDecimal d1 = new BigDecimal(Double.toString(a));
        BigDecimal d2 = new BigDecimal(Double.toString(b));
        return d1.divide(d2,scale , roundingMode).doubleValue();
    }
}
