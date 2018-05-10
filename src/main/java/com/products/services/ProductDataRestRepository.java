package com.products.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "students", collectionResourceRel = "students")
public interface ProductDataRestRepository extends JpaRepository<Product, Long>{
	
	
	  @Query("SELECT AVG(u.price) from Product u")
	  int getAveragePrice();
	  
	  
	  @Query("SELECT MIN(u.price) from Product u")
	  int getLowestPrice();
	  
	  
	  @Query("SELECT MAX(u.price) from Product u")
	  int getHighestPrice();
	  
	  
	  
	  
	  

}
