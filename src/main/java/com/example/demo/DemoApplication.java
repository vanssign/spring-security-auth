package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@SpringBootApplication
@RestController
public class DemoApplication {
//Overview: Req--->Controller--->ServiceLayer---->MessageRepo(Data Acces Layer)----->Database 
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/resource")
  public Map<String,Object> home() {
    Map<String,Object> model = new HashMap<String,Object>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello World");
    return model;
  }
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
