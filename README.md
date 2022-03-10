# JavaToDoListProject

A basic backend application made in Spring Boot

# Why are we doing this?

This project was assigned to me during my training at QA. The goal of the project is to create a Spring Boot API, with utilisation of supporting tools, methodologies, and technologies, that encapsulates all fundamental and practical modules covered during training.

# How did I expect the challenge to go?

I expected a fair amount of challenge, as up until recently I have mainly focused on front end development prior to starting this course.

# What went well? What didn't go as planned?

In this project I found working on the CRUD functionality to be a clear process which I had ease of implementing into the final project. The element that didn't go as planned was my desire to implement update functions using the PUT method, so that the user could modify specific fields of a list item. I overcame this difficulty by using the PATCH method instead and therefore gave the user the ability modify specific fields.

# Possible improvements for future revisions of the project

My revisions would be to include a front end to the project.

# Screenshots showing my Postman requests and the output from the API

## Screenshots - h2 Database


### CREATE
---

![CreateMethodPostman](https://user-images.githubusercontent.com/97603538/157719236-a044b1c5-2ea1-4001-a07e-cd89c465440c.PNG)
![CreateMethodOutput](https://user-images.githubusercontent.com/97603538/157719332-e265fbab-730b-4fe5-94f4-a9676c453b09.PNG)
![CreateMethodH2](https://user-images.githubusercontent.com/97603538/157719394-dfd14b1e-172e-4cd1-b7b0-01793879407a.PNG)


### READ
---

#### GetAll(READ)

![GetAllPostman](https://user-images.githubusercontent.com/97603538/157719662-e407162a-2078-467e-bb31-17dd2bbb0cfc.PNG)
![GetAllOutput](https://user-images.githubusercontent.com/97603538/157719691-c0eb2752-564e-4800-b0eb-d75dc62eaccd.PNG)
![GetAllH2](https://user-images.githubusercontent.com/97603538/157719718-79b285e8-a68e-416e-9ad7-3ab84108d476.PNG)


#### GetById(READ)

![GetByIdPostman](https://user-images.githubusercontent.com/97603538/157719813-392abc56-5f95-41d9-b992-1b33975da613.PNG)
![GetByIdOutput](https://user-images.githubusercontent.com/97603538/157719826-b1fd2017-f27a-48d5-bf41-ed4053297d98.PNG)
![GetByIdH2](https://user-images.githubusercontent.com/97603538/157719842-0ba0d5b0-3210-4bfc-95bd-419e70da79bb.PNG)

#### GetByPriority(READ)

![GetByPriorityPostman](https://user-images.githubusercontent.com/97603538/157719907-7bd7d934-4c4a-43c9-bf8d-e305829a2a43.PNG)
![GetByPriorityOutput](https://user-images.githubusercontent.com/97603538/157719996-605f0264-da6a-480a-86f0-5ac59345e887.PNG)
![GetByPriorityH2](https://user-images.githubusercontent.com/97603538/157720016-72daf78f-3bb6-48a0-a359-27959e684f23.PNG)

#### GetByTitle(READ)

![GetByTitlePostman](https://user-images.githubusercontent.com/97603538/157720112-db517289-26c1-4c16-be3f-1cafc05ac7af.PNG)
![GetByTitleOutput](https://user-images.githubusercontent.com/97603538/157720130-50723809-3238-4aea-929a-ba1e0c3d3e54.PNG)
![GetByTitleH2](https://user-images.githubusercontent.com/97603538/157720151-688abd99-a5d3-44f2-b8f0-ca6e13ce0792.PNG)

### UPDATE
---

#### UpdateAll(UPDATE)

![UpdatePostman](https://user-images.githubusercontent.com/97603538/157720277-e2cf1f81-f6e8-4eb6-be79-a0f48604aac6.PNG)
![UpdateOutput](https://user-images.githubusercontent.com/97603538/157720297-b190a8cd-a764-45cc-9a5b-13cd3de840db.PNG)
![UpdateH2](https://user-images.githubusercontent.com/97603538/157720314-b36e2496-6132-4922-adba-9bdd4e9c8c6e.PNG)

#### UpdateDeadline(UPDATE)

![UpdateDeadlinePostman](https://user-images.githubusercontent.com/97603538/157720414-258a05ef-b2e4-42db-a673-99fc87d2ca43.PNG)
![UpdateDeadlineOutput](https://user-images.githubusercontent.com/97603538/157720421-f3747880-b775-40eb-ac0e-6e93fd1133e2.PNG)
![UpdateDeadlineH2](https://user-images.githubusercontent.com/97603538/157720434-604fc5a5-b793-40be-8093-debae733f199.PNG)

#### UpdateDescription(UPDATE)

![UpdateDescriptionPostman](https://user-images.githubusercontent.com/97603538/157720565-5a46c49e-8aee-40df-a353-bb35fa1798cb.PNG)
![UpdateDescriptionOutput](https://user-images.githubusercontent.com/97603538/157720576-53c8fda7-5364-46a0-8b40-645d4bcecd16.PNG)
![UpdateDescriptionH2](https://user-images.githubusercontent.com/97603538/157720588-ce9c2532-d3fd-4eb0-8856-2e9b94498ff3.PNG)

#### UpdatePriority(UPDATE)

![UpdatePriorityPostman](https://user-images.githubusercontent.com/97603538/157720683-f9fd54a8-b876-42fe-8589-c6f929cb9c5a.PNG)
![UpdatePriorityOutput](https://user-images.githubusercontent.com/97603538/157720692-1e2d5acc-e765-4064-b9c4-d7529110a40d.PNG)
![UpdatePriorityH2](https://user-images.githubusercontent.com/97603538/157720697-a963b310-f87d-4a2b-8b98-3dae132d95a8.PNG)

#### UpdateTitle(UPDATE)

![UpdateTitlePostman](https://user-images.githubusercontent.com/97603538/157720810-40b261b1-2b03-4fa5-bc29-2d0b71795301.PNG)
![UpdateTitleOutput](https://user-images.githubusercontent.com/97603538/157720820-78168a70-a8ac-4c9a-b317-51f02a3d5462.PNG)
![UpdateTitleH2](https://user-images.githubusercontent.com/97603538/157720831-3d4cf363-462e-4b99-8f52-26eb34061458.PNG)

### Delete
---

![DeletePostman](https://user-images.githubusercontent.com/97603538/157720918-1d197936-6a39-4e3d-9cee-1c38f0a4d4fb.PNG)
![DeleteOutput](https://user-images.githubusercontent.com/97603538/157720926-de0f0c0d-0807-4b72-a2af-22c1957bf34e.PNG)
![DeleteH2](https://user-images.githubusercontent.com/97603538/157720932-ce01febb-297e-488a-bf56-7e69c5bea2e5.PNG)



## Screenshots - SQL Database

### CREATE
---

![CreatePostman](https://user-images.githubusercontent.com/97603538/157721783-fa3c121d-4f69-4af4-b1b2-9a21c09467fa.PNG)
![CreateOutput](https://user-images.githubusercontent.com/97603538/157721796-e74b0638-2d4d-4dbb-bf72-d53787fcacfe.PNG)
![CreateSQL](https://user-images.githubusercontent.com/97603538/157721813-3d5a11f8-9ec7-4e7a-ac6e-1c853c56a229.PNG)

### READ
---

#### GetAll(READ)

![GetAllPostman](https://user-images.githubusercontent.com/97603538/157722030-c2dad491-accc-4457-90b0-a5c736947eb5.PNG)
![GetAllOutput](https://user-images.githubusercontent.com/97603538/157722039-d2938176-8849-4451-838d-7bd45603b633.PNG)
![GetAllSQL](https://user-images.githubusercontent.com/97603538/157722065-a3e90f8d-df20-41ad-9bf9-79c376c89a24.PNG)

#### GetById(READ)

![GetByIdPostman](https://user-images.githubusercontent.com/97603538/157722087-ed9e11f7-f3e0-471a-9838-e3e28e194ca4.PNG)
![GetByIdOutput](https://user-images.githubusercontent.com/97603538/157722094-2801e65d-28a1-4711-aab4-bc5b853d1138.PNG)
![GetByIdSQL](https://user-images.githubusercontent.com/97603538/157722120-52497b48-2f68-496e-9a91-6bd9382896e5.PNG)

#### GetBYPriority(READ)

![GetByPriorityPostman](https://user-images.githubusercontent.com/97603538/157722159-85c267af-5dfd-4e78-a039-d21a9f1ae5d1.PNG)
![GetByPriorityOutput](https://user-images.githubusercontent.com/97603538/157722175-71883426-38ac-40b8-a115-6578b7f59fbe.PNG)
![GetByPrioritySQL](https://user-images.githubusercontent.com/97603538/157722187-f40bfd2f-e2d1-4518-be54-14c3c0aece80.PNG)

#### GetByTitle(READ)

![GetByTitlePostman](https://user-images.githubusercontent.com/97603538/157722228-24d72dc2-1717-4882-a3b3-03bf8cf8a4e2.PNG)
![GetByTitleOutput](https://user-images.githubusercontent.com/97603538/157722240-27ec3b36-f999-4ec3-913a-4c5e215b2091.PNG)
![GetByTitleSQL](https://user-images.githubusercontent.com/97603538/157722253-0d2761a1-1108-4b91-81d0-ff6069fd8e3b.PNG)

### UPDATE
---

#### UpdateDeadline(UPDATE)

![UpdateDeadlinePostman](https://user-images.githubusercontent.com/97603538/157722512-69c98f19-7a13-468c-b86b-0ed4afeee2f6.PNG)
![UpdateDeadlineOutput](https://user-images.githubusercontent.com/97603538/157722522-ceda0cd3-2a79-40df-8e9b-cbf8d210d4ae.PNG)
![UpdateDeadlineSQL](https://user-images.githubusercontent.com/97603538/157722530-3dc62aff-cb5c-4337-9494-6abad9dc5f2a.PNG)

#### UpdateDescription(UPDATE)

![UpdateDescriptionPostman](https://user-images.githubusercontent.com/97603538/157722558-8e3dda43-2b08-4dbb-83f5-9be3d4631c31.PNG)
![UpdateDescriptionOutput](https://user-images.githubusercontent.com/97603538/157722568-c1a9069b-685e-4d8c-add4-b0a4f8ec730c.PNG)
![UpdateDescriptionSQL](https://user-images.githubusercontent.com/97603538/157722578-931769d7-9ed7-4714-958c-f15f24c2cbb9.PNG)

#### UpdatePriority(UPDATE)

![UpdatePriorityPostman](https://user-images.githubusercontent.com/97603538/157722612-42863fb1-6f43-4ef2-94ec-cdb15f53574c.PNG)
![UpdatePriorityOutput](https://user-images.githubusercontent.com/97603538/157722619-319e9f93-bfb6-4d8c-80be-11905240d65c.PNG)
![UpdatePrioritySQL](https://user-images.githubusercontent.com/97603538/157722640-1055faad-9c65-4888-8f6c-b7095f8b27a0.PNG)

#### UpdateTitle(UPDATE)

![UpdateTitlePostman](https://user-images.githubusercontent.com/97603538/157722658-4a71a67f-a692-4f2e-bcb3-f6cde7b74ab3.PNG)
![UpdateTitleOutput](https://user-images.githubusercontent.com/97603538/157722667-d32add94-998d-49e7-8a12-79fc2c6f80e1.PNG)
![UpdateTitleSQL](https://user-images.githubusercontent.com/97603538/157722681-8ef4eecc-1b10-4160-b99f-034f21a0601d.PNG)

### DELETE
---

![DeletePostman](https://user-images.githubusercontent.com/97603538/157722779-e9b7566e-1ce6-41ed-bf1a-4f79fd9bc19b.PNG)
![DeleteOutput](https://user-images.githubusercontent.com/97603538/157722804-3b562d27-185a-4b49-983d-6bdc635f7ca4.PNG)
![DeleteSQL](https://user-images.githubusercontent.com/97603538/157722815-459bc90f-239b-46bd-90c7-e366e57b57cf.PNG)


### Screenshots of persistant data
---

![DisconnectOutput](https://user-images.githubusercontent.com/97603538/157722922-30788c10-ef54-4ae8-bea9-5d74eb28ef2a.PNG)
![DisconnectSQL](https://user-images.githubusercontent.com/97603538/157722934-995191a5-c219-407c-b776-59481aadad15.PNG)
