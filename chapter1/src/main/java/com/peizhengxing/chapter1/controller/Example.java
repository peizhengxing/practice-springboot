package com.peizhengxing.chapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.peizhengxing.chapter1.exception.MyException;

@Controller
public class Example {
	@RequestMapping("/hello")
	@ResponseBody
    public String hello(){
    	return "Hello World";
    }
	
	@RequestMapping("/")
	public String index(ModelMap map){
		map.addAttribute("host", "https://www.baidu.com");
		return "index";
	}
	
	@RequestMapping("/errorView")
	public String helloError() throws Exception{
		throw new Exception("test error handler");
	}
	
	@RequestMapping("/errorJSON")
	@ResponseBody
	public String errorJSON() throws MyException{
		throw new MyException("return JSON format");
	}
	
}
