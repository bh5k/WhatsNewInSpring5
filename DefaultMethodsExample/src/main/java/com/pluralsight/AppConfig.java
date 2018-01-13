package com.pluralsight;

import org.springframework.context.annotation.Bean;

public interface AppConfig {
	@Bean
	default ShowMessageBean getMessengerBean() {
		return new ShowMessageBean();
	}

}
