package com.zyf;

import com.zyf.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		System.out.println(ac.getBean("cat"));
	}
}
