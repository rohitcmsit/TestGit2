package com.test;

import static org.junit.Assert.*;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springbootapplication.controller.CustomerController;
import springbootapplication.domain.Customer;

public class SqlApplicationTests {

	@Autowired
	CustomerController customerController;
	
	@Before
	public void setUp() throws Exception {
		
		customerController = new CustomerController();
		
	}

	@After
	public void tearDown() throws Exception {
		
		customerController = null;
	}
	
	@Test
	public void indexTest() throws Exception{
		
			assertEquals("data inserted Successfully",customerController.index().toString());
	}
	
	@Test(expected = Exception.class)
	public void findallTest(){
		
		List<Customer> users = customerController.findall();
		System.out.println(users.size());
		assertTrue( users.size() > 0);
		
	}
	
}
