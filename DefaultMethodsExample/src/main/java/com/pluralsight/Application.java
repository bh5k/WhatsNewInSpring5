package com.pluralsight;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application implements AppConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		MessageBean bean = context.getBean(ShowMessageBean.class);
		bean.showMessage("Test message");
		context.close();
	}
}