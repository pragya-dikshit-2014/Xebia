package com.products;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.products.services.ProductDataRestRepository;

@SpringBootApplication
public class SpringBootTesting{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductDataRestRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTesting.class, args);
	}
}
