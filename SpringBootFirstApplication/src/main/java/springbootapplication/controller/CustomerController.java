package springbootapplication.controller;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springbootapplication.domain.Customer;
import springbootapplication.repo.CustomerRepo;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired  
    JdbcTemplate jdbc;    
    @RequestMapping("/insert")  
    public String index(){  
       
			jdbc.execute("insert into customer(name,phone)values('Rakesh Das','999988889')"); 
			jdbc.execute("insert into customer(name,phone)values('Rohit','999999909')");
			jdbc.execute("insert into customer(name,phone)values('Manjunatha','9977665544')");
			jdbc.execute("insert into customer(name,phone)values('Jagadeesh','9768954689')");
        return "data inserted successfully";
    } 
    
	@Autowired
	CustomerRepo customerRepo;
	@RequestMapping("/findall")
	@ResponseBody
	public List<Customer> findall(){
	
		 return customerRepo.findAll();
	}
}

