package com.shi.springmvc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClient {

	public static final String HTTP_METHOD_POST = "POST";
	public static final String HTTP_METHOD_GET = "GET";
	public static final String HTTP_METHOD_PUT = "PUT";
	public static final String HTTP_METHOD_DELETE = "DELETE";
	public static final Integer CONNECT_TIME_OUT = 10000;

	public static HttpClient create(URL url) {
		return new HttpClient(url);
	}

	URL mURL;
	String mMethod = HTTP_METHOD_GET;
	String mData = "";
	Map<String, String> mPropertys;

	HttpClient(URL url) {
		mURL = url;
		mPropertys = new HashMap<String, String>();
	}

	public synchronized void setRequestMethod(String method) {
		if (method == null || "".equals(method))
			return;
		if (HTTP_METHOD_POST == method || HTTP_METHOD_GET == method
				|| HTTP_METHOD_PUT == method || HTTP_METHOD_DELETE == method) {
			mMethod = method;
		}
	}

	public synchronized void setRequestData(String data) {
		if (data == null)
			return;
		mData = data;
	}

	public synchronized void setRequestProperty(String name, String value) {
		if (name == null || "".equals(name) || value == null
				|| "".equals(value))
			return;
		mPropertys.put(name, value);
	}

	public synchronized String execute() throws IOException {
		return execute("utf-8", CONNECT_TIME_OUT);
	}

	public synchronized String execute(String encode) throws IOException {
		return execute(encode, CONNECT_TIME_OUT);
	}

	public synchronized String execute(String encode, Integer timeout)
			throws IOException {
		HttpURLConnection conn = (HttpURLConnection) mURL.openConnection();
		conn.setRequestMethod(mMethod);
		conn.setDoInput(true);
		conn.setConnectTimeout(timeout);
		if (HTTP_METHOD_POST == mMethod) {
			conn.setRequestProperty("Content-type", "application/json");
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-Length",
					String.valueOf(mData.getBytes().length));
			conn.getOutputStream().write(mData.getBytes(encode));
		}
		int code = conn.getResponseCode();
		System.out.println("****code:" + code);
		if (code == HttpURLConnection.HTTP_OK) {
			InputStreamReader isr = new InputStreamReader(
					conn.getInputStream(), encode);
			BufferedReader in = new BufferedReader(isr);
			StringBuffer sbuf = new StringBuffer();
			String inputLine = null;
			while ((inputLine = in.readLine()) != null) {
				sbuf.append(inputLine);
			}
			return sbuf.toString();
		}
		return null;
	}
	
	
	static public void post(String url, String body){
	    CloseableHttpClient httpClient = null;
	    HttpPost httpPost = null;
	    try {
	        httpClient = HttpClients.createDefault();
	        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(20000).setConnectTimeout(20000).build();
	        httpPost = new HttpPost(url);
	        httpPost.setConfig(requestConfig);
	        httpPost.setEntity(new StringEntity(body));
	        CloseableHttpResponse response = httpClient.execute(httpPost);
	        HttpEntity httpEntity = response.getEntity();
	        System.out.println(EntityUtils.toString(httpEntity,"utf-8"));
	    } catch (ClientProtocolException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }finally{
	        try {
	            if(httpPost!=null){
	                httpPost.releaseConnection();
	            }
	            if(httpClient!=null){
	                httpClient.close();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	public static void main(String[] args) {
		
		String body="{\"token\":\"VNLO12MTZRF5X30SMUATG980A5DUGZFQ\"}";
		String url="http://127.0.0.1:8080/angeldoctor/hospital/workInfoList.htm";
		 
		HttpClient.post(url,body);
		
//		try {
//
//			String temp = "{\"token\":\"VNLO12MTZRF5X30SMUATG980A5DUGZFQ\"}"; // json数据{ \"username\":\"test\",\"password\":\"123\"}
//
//			HttpClient http = new HttpClient(new URL("http://127.0.0.1:8080/angeldoctor/hospital/workInfoList.htm"));
//
//			http.setRequestMethod(HttpClient.HTTP_METHOD_POST);
//			http.setRequestData(temp);
//			
//			HttpPost httpPost = new HttpPost("");
//			        //   httpPost.setConfig(requestConfig);
//			       //    httpPost.setEntity(new StringEntity(body));
//			
//
//			String respCode = new String(http.execute());
//			System.out.println("****finished,respCode:" + respCode);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	}

}
