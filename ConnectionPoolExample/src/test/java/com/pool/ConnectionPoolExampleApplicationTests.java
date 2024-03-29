package com.pool;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pool.models.User;
import com.pool.service.Services;

@SpringBootTest
class ConnectionPoolExampleApplicationTests {

	@Autowired
	private Services services;
	
//	@Test
//	public void insertTest() {
//		User user = services.saveUser(new User(4,"Abaan","student"));
//		System.out.println(user.getId()+" "+user.getName()+" "+user.getStatus());
//	}
//	@Test
//	public void allTest() {
//		services.getAllUsers().forEach(user->{
//			System.out.println(user.toString());
//		});
//	}
//	@Test
//	public void getUserByIdTest() {
//		System.out.println(services.getUserById(1).toString());
//		
//	}
	@Test
	public void deleteTest() {
		services.deleteUser(4);
	}

}
