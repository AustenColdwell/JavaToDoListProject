package com.qa.service;

import static org.assertj.core.api.Assertions.assertThat;

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

}
