package com.bawei;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {
	public static void main(String[] args) throws IOException {
		System.err.println("服务开始启动");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:applicationContext-dubbo-provider.xml", "classpath:applicationContext-dao.xml");
		context.start();
		System.out.println("服务启动完成");
		
		System.in.read();
	}
}
