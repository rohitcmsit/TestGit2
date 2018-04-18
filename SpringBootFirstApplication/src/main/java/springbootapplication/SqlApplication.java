package springbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springbootapplication.controller.CustomerController;

@SpringBootApplication
public class SqlApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SqlApplication.class, args);
	}
}
