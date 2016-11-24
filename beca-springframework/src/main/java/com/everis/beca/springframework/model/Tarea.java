package com.everis.beca.springframework.model;

import java.util.Date;

public class Tarea {
	
	private Long id;
	private String title;
	private String text;
	private Date createdDate;
	private String username;
	private Integer state;
	
	public Tarea() {
		super();
	}
	
	public Tarea(Long id, String title, String text, Date createdDate, String username) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
		this.createdDate = createdDate;
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	
	
}
