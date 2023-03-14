package com.example.mysqlspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MysqlspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlspringApplication.class, args);
	}
	@GetMapping("")
	public String home(){
		return "Welcome Home";
	}

}
