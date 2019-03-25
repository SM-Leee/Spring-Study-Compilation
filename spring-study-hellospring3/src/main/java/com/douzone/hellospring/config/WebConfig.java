package com.douzone.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc		//  web.xml에서 mvc:annotation-driven이랑 똑같은 역활을 한다.
@ComponentScan("com.douzone.hellospring.controller")	//web.xml에서 context:component-scan 과 같은 역할을 한다.
public class WebConfig {
	//명시해서 하는 설정
	//.xml 명시해서 하는 설정이 java에서는 어떻게 하는가?
	
	//ViewResolver 설정
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = 
				new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}
}
