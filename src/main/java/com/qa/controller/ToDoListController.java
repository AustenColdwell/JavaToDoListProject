package com.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.entity.ListItem;
import com.qa.service.ToDoService;

@RestController
public class ToDoListController {
	
	@Autowired
	private ToDoService service;
	
	@Autowired
	public ToDoListController(ToDoService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<ListItem> createItem(@RequestBody ListItem listItem){
		return new ResponseEntity<ListItem>(this.service.createListItem(listItem), HttpStatus.ACCEPTED);
	}

}
