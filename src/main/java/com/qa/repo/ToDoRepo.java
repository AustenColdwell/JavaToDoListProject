package com.qa.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.entity.ListItem;

@Repository
public interface ToDoRepo extends JpaRepository<ListItem, Integer>{

	public List<ListItem> findListItemByTitle(String title);
	
	@Query(value = "SELECT * FROM LIST_ITEM ORDER BY priority DESC LIMIT ?1", nativeQuery = true)
	public List<ListItem> findListItemByPriority(int limit);
	
}
