package com.pluralsight;

import javax.annotation.PostConstruct;

public interface MessageBean {
	
	public void showMessage(String msg);
	
	@PostConstruct
    default void init() {
        System.out.println("post construct: "+this.getClass().getSimpleName());
    }
}
