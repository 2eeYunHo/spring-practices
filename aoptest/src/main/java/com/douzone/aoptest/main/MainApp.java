package com.douzone.aoptest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.douzone.aoptest.service.ProductService;
import com.douzone.aoptest.vo.ProductVo;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		//패키지config /applicationContext이라는 설정파일이라 선언
		ProductService ps = ac.getBean(ProductService.class);
		
		ProductVo vo = ps.find("TV");
		System.out.println(vo);
		
		((AbstractApplicationContext)ac).close();
	}
}