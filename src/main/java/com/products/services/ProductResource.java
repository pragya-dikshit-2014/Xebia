package com.products.services;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class ProductResource {	

		@Autowired
		private ProductDataRestRepository ProductRepository;
   //by admin
		@GetMapping("/products")
		public List<Product> retrieveAllProducts() {
			return ProductRepository.findAll();
		}
   //by admin for specific id
		@GetMapping("/products/{bar_code}")
		public Product retrieveProductsForAdmin(@PathVariable long bar_code) {
			
			
			Optional<Product> product = ProductRepository.findById(bar_code);
			
			
			 

			if (!product.isPresent())
				throw new ProducttNotFoundException("bar code-" + bar_code);
			
			
			        int average = ProductRepository.getAveragePrice();
			
			return product.get() ;
		}
      
		
		

       //insert by user
		@PostMapping("/products")
		public ResponseEntity<Object> createProduct(@RequestBody Product product) {
			Product savedProduct = ProductRepository.save(product);

			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{bar_code}")
					.buildAndExpand(savedProduct.getPrice()).toUri();

			return ResponseEntity.created(location).build();

		}
		

	}
	
	
	
	
	
	
	
