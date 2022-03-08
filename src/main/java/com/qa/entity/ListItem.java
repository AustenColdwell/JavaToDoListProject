package com.qa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increments
	private int id;
	
	@Column(name = "title")
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "deadline")
	private String deadline;
	@Column(name = "priority")
	private int priority;
	
	public ListItem() {
		
	}
	
	public ListItem(int id, String title, String description, String deadline, int priority) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.priority = priority;
	}

	public ListItem(String title, String description, String deadline, int priority) {
		this.title = title;
		this.description = description;
		this.deadline = deadline;
		this.priority = priority;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	

}
