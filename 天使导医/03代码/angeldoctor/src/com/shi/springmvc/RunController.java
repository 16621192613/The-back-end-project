package com.shi.springmvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 

@Controller
 
public class RunController {
 
	@ResponseBody
	@RequestMapping(value = "get11.htm",   method = { RequestMethod.POST })
	public String get( @RequestBody List<TestL> testL) {
		Map<String, Object> responseMap = new HashMap<String, Object>();
		responseMap.put("code", 1000);
		responseMap.put("msg", "22222222");
		responseMap.put("params", "3222");
		responseMap.put("rows", "");
		return "";
	}
	
	
	@RequestMapping(value="/add.htm", method={RequestMethod.POST})
	@ResponseBody
	public String addSomething(@RequestBody   TestL user) {
	// Handle it
	return "something is added!";
	}

	

	@ResponseBody
	@RequestMapping(value = "get2.htm",   method = {RequestMethod.GET })
	public String get2(@RequestParam("id") long id ) {
		Map<String, Object> responseMap = new HashMap<String, Object>();
		responseMap.put("code", 1000);
		responseMap.put("msg", "22222222");
		responseMap.put("params", "3222");
		responseMap.put("rows", "");
		return "";
	}
	
	
}
