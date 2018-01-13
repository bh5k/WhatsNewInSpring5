package com.pluralsight.java.demo;

public class Greeting {
	
	private Long id;
	private String content;

	public Greeting(Long id, String content) {
		this.setId(id);
		this.setContent(content);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
