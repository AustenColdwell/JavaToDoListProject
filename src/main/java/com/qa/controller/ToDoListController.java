package com.qa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	//========== CREATE ==========
	@PostMapping("/create")
	public ResponseEntity<ListItem> createItem(@RequestBody ListItem listItem){
		return new ResponseEntity<ListItem>(this.service.createListItem(listItem), HttpStatus.ACCEPTED);
	}
	
	//========== READ ==========
	@GetMapping("/getAll")
	public ResponseEntity<List<ListItem>> getAllItems(){
		return new ResponseEntity<List<ListItem>>(this.service.getAllListItems(), HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<ListItem> getItemById(@PathVariable int id){
		return new ResponseEntity<ListItem>(this.service.getById(id), HttpStatus.OK);
	}
	
	@GetMapping("/getByTitle/{title}")
	public ResponseEntity<List<ListItem>> getItemByTitle(@PathVariable String title){
		return new ResponseEntity<List<ListItem>>(this.service.getListItemByTitle(title), HttpStatus.OK);
	}
	
	@GetMapping("/getByPriority/{limit}")
	public ResponseEntity<List<ListItem>> getItemByPriority(@PathVariable int limit){
		return new ResponseEntity<List<ListItem>>(this.service.getListItemByPriority(limit), HttpStatus.OK);
	}
	
	//========== UPDATE ==========
	@PutMapping("/update/{id}")
	public ResponseEntity<ListItem> updateList(@PathVariable int id, @RequestBody ListItem listItem) {
		return new ResponseEntity<ListItem>(this.service.updateListItem(id, listItem), HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/updateTitle/{id}")
	public ResponseEntity<ListItem> updateTitle(@PathVariable int id, @RequestBody ListItem listItem){
		return new ResponseEntity<ListItem>(this.service.updateListTitle(id, listItem), HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/updateDescription/{id}")
	public ResponseEntity<ListItem> updateDescription(@PathVariable int id, @RequestBody ListItem listItem){
		return new ResponseEntity<ListItem>(this.service.updateListDescription(id, listItem), HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/updateDeadline/{id}")
	public ResponseEntity<ListItem> updateDeadline(@PathVariable int id, @RequestBody ListItem listItem){
		return new ResponseEntity<ListItem>(this.service.updateListDeadline(id, listItem), HttpStatus.ACCEPTED);
	}
	
	@PatchMapping("/updatePriority/{id}")
	public ResponseEntity<ListItem> updatePriority(@PathVariable int id, @RequestBody ListItem listItem){
		return new ResponseEntity<ListItem>(this.service.updateListPriority(id, listItem), HttpStatus.ACCEPTED);
	}
	
	//========== DELETE ==========
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteItem(@PathVariable int id){
		boolean hasDeleted = this.service.deleteListItem(id);
		if(!hasDeleted) {
			return new ResponseEntity<Boolean>(this.service.deleteListItem(id), HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<Boolean>(hasDeleted, HttpStatus.METHOD_NOT_ALLOWED);
		}
	}

}
