package com.zyf.config;

import com.zyf.bean.First;
import com.zyf.bean.Second;
import com.zyf.entity.Cat;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.zyf")
//@MapperScan("com.zyf.mapper")

public class MyConfig {
	@Bean
	public First first(){
		return new First();
	}
	@Bean
	public Second second(){
		return new Second();
	}
}
