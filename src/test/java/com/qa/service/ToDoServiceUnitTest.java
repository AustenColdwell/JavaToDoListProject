package com.qa.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.entity.ListItem;
import com.qa.repo.ToDoRepo;

@SpringBootTest
public class ToDoServiceUnitTest {
	
	@Autowired
	private ToDoService service;
	
	@MockBean
	private ToDoRepo repo;
	
	@Test
	void createListItemTest() {
		
		//given
		ListItem itemToSave = new ListItem("Test title", "Test description", "08/03/2022", 10);
		ListItem itemSaved = new ListItem(1, "Test title", "Test description", "08/03/2022", 10);
		//when
		Mockito.when(this.repo.save(itemToSave)).thenReturn(itemSaved);
		//then
		assertThat(this.service.createListItem(itemToSave)).isEqualTo(itemSaved);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).save(Mockito.any(ListItem.class));
		
	}

	@Test
	void getAllListItemsTest() {
		
		//given
		List<ListItem> listItem = new ArrayList<ListItem>();
		listItem.add(new ListItem("Test title one", "Test description", "08/03/2022", 10));
		listItem.add(new ListItem("Test title two", "Test description", "08/03/2022", 10));
		listItem.add(new ListItem("Test title three", "Test description", "08/03/2022", 10));
		//when
		Mockito.when(this.repo.findAll()).thenReturn(listItem);
		//then
		assertThat(this.service.getAllListItems()).isEqualTo(listItem);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).findAll();
	}
	
	@Test
	void getByIdTest() {
		
		//given
		int id = 1;
		ListItem foundListItem = new ListItem(1, "Test title one", "Test description", "08/03/2022", 10);
		//when
		Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(foundListItem));
		//then
		assertThat(this.service.getById(id)).isEqualTo(foundListItem);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).findById(Mockito.anyInt());
	}
	
	@Test
	void getByTitle() {
		
		//given
		String title = "Test title";
		List<ListItem> listItem = new ArrayList<>();
		listItem.add(new ListItem("Test title", "Test description", "08/03/2022", 10));
		//when
		Mockito.when(this.repo.findListItemByTitle(title)).thenReturn(listItem);
		//then
		assertThat(this.service.getListItemByTitle(title)).isEqualTo(listItem);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).findListItemByTitle(Mockito.anyString());
	}
	
	@Test
	void getByPriority() {
		
		//given
		int limit = 5;
		List<ListItem> listItem = new ArrayList<>();
		listItem.add(new ListItem("Test title", "Test description", "08/03/2022", 10));
		//when
		Mockito.when(this.repo.findListItemByPriority(limit)).thenReturn(listItem);
		//then
		assertThat(this.service.getListItemByPriority(limit)).isEqualTo(listItem);
		//verify
		Mockito.verify(this.repo, Mockito.times(1)).findListItemByPriority(Mockito.anyInt());
		
	}

}
