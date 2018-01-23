package com.demo.www.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.www.service.DemoService;
/**
 * 测试controller
 */
@RestController
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/")  
    String home() {  
        return "Hello World!";  
    }  
      
    @RequestMapping("/hello/{myName}")  
    String index(@PathVariable String myName) {  
        return "Hello "+myName+"!!!";  
    }  
    
    @RequestMapping("/bejson")  
    Map<String,Object> bejson() {  
    	demoService.run();
    	List<Integer> list = Arrays.asList(1,2,3,4,5);
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("bejson", list);
    	return map;  
    }  
}
