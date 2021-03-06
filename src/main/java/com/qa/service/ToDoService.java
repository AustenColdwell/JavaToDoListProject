package com.qa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.entity.ListItem;
import com.qa.exception.ItemNotFoundException;
import com.qa.repo.ToDoRepo;

@Service
public class ToDoService {
	
	@Autowired
	private ToDoRepo repo;
	
	@Autowired
	public ToDoService(ToDoRepo repo) {
		this.repo = repo;
	}
	
	//========================= CREATE =========================\\
	public ListItem createListItem(ListItem listItem) {
		return this.repo.save(listItem);
	}
	
	//========================= READ =========================\\
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
	
	public List<ListItem> getListItemByTitle(String title){
		return this.repo.findListItemByTitle(title);
	}
	
	public List<ListItem> getListItemByPriority(int limit){
		return this.repo.findListItemByPriority(limit);
	}
	
	//========================= UPDATE =========================\\
	public ListItem updateListItem(int id, ListItem listItem) {
		ListItem foundItem = this.getById(id);
		
		foundItem.setTitle(listItem.getTitle());
		foundItem.setDescription(listItem.getDescription());
		foundItem.setDeadline(listItem.getDeadline());
		foundItem.setPriority(listItem.getPriority());
		
		return this.repo.save(foundItem);
	}
	
	public ListItem updateListTitle(int id, ListItem listItem) {
		ListItem foundItem = this.getById(id);
		
		foundItem.setTitle(listItem.getTitle());
		
		return this.repo.save(foundItem);
	}
	
	public ListItem updateListDescription(int id, ListItem listItem) {
		ListItem foundItem = this.getById(id);
		
		foundItem.setDescription(listItem.getDescription());
		
		return this.repo.save(foundItem);
	}
	
	public ListItem updateListDeadline(int id, ListItem listItem) {
		ListItem foundItem = this.getById(id);
		
		foundItem.setDeadline(listItem.getDeadline());
		
		return this.repo.save(foundItem);
	}
	
	public ListItem updateListPriority(int id, ListItem listItem) {
		ListItem foundItem = this.getById(id);
		
		foundItem.setPriority(listItem.getPriority());
		
		return this.repo.save(foundItem);
	}
	
	//========================= DELETE =========================\\
	public boolean deleteListItem(int id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
