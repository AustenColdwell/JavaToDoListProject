package com.qa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.Exception.ItemNotFoundException;
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
	
	public List<ListItem> getAllListItems(){
		return this.repo.findAll();
	}
	
	public ListItem getById(int id) {
		Optional<ListItem> listOptional = this.repo.findById(id);
		
		if(listOptional.isPresent()) {
			return listOptional.get();
		}else {
			throw new ItemNotFoundException("Item not found");
		}
	}
	
	public ListItem updateListItem(int id, ListItem listItem) {
		ListItem foundItem = this.getById(id);
		
		foundItem.setTitle(listItem.getTitle());
		foundItem.setDescription(listItem.getDescription());
		foundItem.setDeadline(listItem.getDeadline());
		foundItem.setPriority(listItem.getPriority());
		
		return this.repo.save(foundItem);
	}

}
