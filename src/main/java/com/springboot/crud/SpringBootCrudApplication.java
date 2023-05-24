package com.springboot.crud;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.crud.dao.UserRepository;
import com.springboot.crud.entitis.User;

@SpringBootApplication
public class SpringBootCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootCrudApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

		
		/*
		//CREATE (C) Operation starts -> Create object of user
		User user1 = new User();
		user1.setUserName("Rownab Das Gupta");
		user1.setUserCity("Hyderabad");
		user1.setUserStatus("Married");
		
		User user2 = new User();
		user2.setUserName("Sumi Mukherjee");
		user2.setUserCity("Kolkata");
		user2.setUserStatus("Married");
		
		//This is to save a single object only
		//User userResult = userRepository.save(user1);
		//System.out.println(userResult);
		
		//This is to save multiple object at a time
		List<User> usersList = List.of(user1, user2);
		Iterable<User> result = userRepository.saveAll(usersList);
		
		//printing all inserted result
		result.forEach(user->{
			System.out.println(user);
		});
		
		//CREATE Operation ends.
		*/
		
		
		
		
		/*
		
		//UPDATE (U) Operation Starts -> Update object of user using Id
		//Process to get 1 data using id
//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//		user.setUserName("Rahul Mukherjkee");
//		User result = userRepository.save(user);
//		System.out.println(result);
		
		//UPDATE Operation ends 
		
		*/
		
		
		
		
		/*
		//READ/GET (R) Operation starts -> Process to get all the data 
		//Process - 1 (Old way)
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
		
		
		//Process - 2 (New way)
		Iterable<User> itr = userRepository.findAll();
		itr.forEach(new Consumer<User>() {
			@Override
			public void accept(User t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		
		//Process - 3 (New way)
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user->
//			System.out.println(user)	//here only one line 'System.out.println(user)', for multiple lines '{System.out.println(user);}'
//		);
//	
 
		//READ/GET Operation Ends 
		*/
		
		
		/*
		//DELETE (D) Operation starts ->  Delete the user element
		//Process 1 -> delete by id
//		userRepository.deleteById(5);
		
		//Process 2 -> delete All
		Iterable<User> allUsers = userRepository.findAll();
		allUsers.forEach(user->System.out.println(user));
		userRepository.deleteAll(allUsers);
		
		//DELETE Operation Ends
		*/
		
		System.out.println("CRUD Operation is Running Successfully...!!!");
		
		//CRUD Operation ends -------------------------------------------------------------------------------
		
		
		
	}

}
