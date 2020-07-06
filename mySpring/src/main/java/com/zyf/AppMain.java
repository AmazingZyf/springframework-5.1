package com.zyf;

import com.zyf.config.MyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		//ac.addBeanFactoryPostProcessor();
		System.out.println(ac.getBean("cat"));
	}
}
