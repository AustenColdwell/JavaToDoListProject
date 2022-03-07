package com.qa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.entity.ListItem;
import com.qa.repo.ToDoRepo;

@Service
public class ToDoService {
	
	@Autowired
	private ToDoRepo repo;
	
	@Autowired
	public ToDoService(ToDoRepo repo) {
		this.repo = repo;
	}
	
	public ListItem createListItem(ListItem listItem) {
		return this.repo.save(listItem);
	}

}
