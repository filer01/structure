package com.demo.www.service.impl;

import org.springframework.stereotype.Service;

import com.demo.www.service.DemoService;
/**
 * 测试Service实现
 */
@Service
public class DemoServiceimpl implements DemoService {

	public void run() {
		System.out.println("running...");
	}

}
