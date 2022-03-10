package com.qa.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.entity.ListItem;

@SpringBootTest
@ActiveProfiles("test")
@Sql(scripts = {"classpath:list-schema.sql", "classpath:list-data.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@AutoConfigureMockMvc
public class ToDoListControllerIntegrationTest {
	
	@Autowired
	private MockMvc mock;
	
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void createListItemTest() throws Exception{
		
		ListItem newListItem = new ListItem("test title four", "test description four", "test date four", 5);
		String newListItemJSON = this.mapper.writeValueAsString(newListItem);
		
		ListItem savedListItem = new ListItem(4, "test title four", "test description four", "test date four", 5);
		String savedListItemJSON = this.mapper.writeValueAsString(savedListItem);
		
		RequestBuilder request = post("/create").contentType(MediaType.APPLICATION_JSON)
				.content(newListItemJSON);
		
		ResultMatcher responseStatus = status().isCreated();
		ResultMatcher responseContent = content().json(savedListItemJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
	}
	
	@Test
	void readAllListItems() throws Exception{
		
		List<ListItem> listOfItems = new ArrayList<>();
		
		listOfItems.add(new ListItem("test title one", "test description one", "test date one", 3));
		listOfItems.add(new ListItem("test title two", "test description two", "test date two", 3));
		listOfItems.add(new ListItem("test title three", "test description three", "test date three", 3));
		
		String savedListItemsJSON = this.mapper.writeValueAsString(listOfItems);
		
		RequestBuilder request = get("/getAll");
		ResultMatcher responseStatus = status().isOk();
		ResultMatcher responseContent = content().json(savedListItemsJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void getListItemById() throws Exception{
		
		ListItem savedListItem = new ListItem(1, "test title one", "test description one", "test date one", 3);
		String savedListItemJSON = this.mapper.writeValueAsString(savedListItem);
		
		RequestBuilder request = get("/getById/1");
		
		ResultMatcher responseStatus = status().isOk();
		ResultMatcher responseContent = content().json(savedListItemJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void getListItemByTitle() throws Exception{
		
		List<ListItem> listOfItems = new ArrayList<>();
		
		listOfItems.add(new ListItem("test title one", "test description one", "test date one", 3));
		String savedListItemsJSON = this.mapper.writeValueAsString(listOfItems);
		
		RequestBuilder request = get("/getByTitle/test title one");
		
		ResultMatcher responseStatus = status().isOk();
		ResultMatcher responseContent = content().json(savedListItemsJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void getListItemByPriority() throws Exception{
		
		List<ListItem> listOfItems = new ArrayList<>();
		
		listOfItems.add(new ListItem("test title one", "test description one", "test date one", 3));
		listOfItems.add(new ListItem("test title two", "test description two", "test date two", 3));
		listOfItems.add(new ListItem("test title three", "test description three", "test date three", 3));
		String savedListItemsJSON = this.mapper.writeValueAsString(listOfItems);
		
		RequestBuilder request = get("/getByPriority/3");
		
		ResultMatcher responseStatus = status().isOk();
		ResultMatcher responseContent = content().json(savedListItemsJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void updateListItem() throws Exception{
		
		ListItem savedListItem = new ListItem(1, "test title one", "test description one", "test date one", 3);
		String savedListItemJSON = this.mapper.writeValueAsString(savedListItem);
		
		RequestBuilder request = put("/update/1").contentType(MediaType.APPLICATION_JSON).content(savedListItemJSON);
		
		ResultMatcher responseStatus = status().isAccepted();
		ResultMatcher responseContent = content().json(savedListItemJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void updateTitle() throws Exception{
		
		ListItem savedListItem = new ListItem(1, "test title one", "test description one", "test date one", 3);
		String savedListItemJSON = this.mapper.writeValueAsString(savedListItem);
		
		RequestBuilder request = patch("/updateTitle/1").contentType(MediaType.APPLICATION_JSON).content(savedListItemJSON);
		
		ResultMatcher responseStatus = status().isAccepted();
		ResultMatcher responseContent = content().json(savedListItemJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void updateDescription() throws Exception{
		
		ListItem savedListItem = new ListItem(1, "test title one", "test description one", "test date one", 3);
		String savedListItemJSON = this.mapper.writeValueAsString(savedListItem);
		
		RequestBuilder request = patch("/updateDescription/1").contentType(MediaType.APPLICATION_JSON).content(savedListItemJSON);
		
		ResultMatcher responseStatus = status().isAccepted();
		ResultMatcher responseContent = content().json(savedListItemJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void updateDeadline() throws Exception{
		
		ListItem savedListItem = new ListItem(1, "test title one", "test description one", "test date one", 3);
		String savedListItemJSON = this.mapper.writeValueAsString(savedListItem);
		
		RequestBuilder request = patch("/updateDeadline/1").contentType(MediaType.APPLICATION_JSON).content(savedListItemJSON);
		
		ResultMatcher responseStatus = status().isAccepted();
		ResultMatcher responseContent = content().json(savedListItemJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}
	
	@Test
	void updatePriority() throws Exception{
		
		ListItem savedListItem = new ListItem(1, "test title one", "test description one", "test date one", 3);
		String savedListItemJSON = this.mapper.writeValueAsString(savedListItem);
		
		RequestBuilder request = patch("/updatePriority/1").contentType(MediaType.APPLICATION_JSON).content(savedListItemJSON);
		
		ResultMatcher responseStatus = status().isAccepted();
		ResultMatcher responseContent = content().json(savedListItemJSON);
		
		this.mock.perform(request).andExpect(responseStatus).andExpect(responseContent);
		
	}

}
