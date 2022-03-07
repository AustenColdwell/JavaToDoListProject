package com.qa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.entity.ListItem;

@Repository
public interface ToDoRepo extends JpaRepository<ListItem, Integer>{

}
