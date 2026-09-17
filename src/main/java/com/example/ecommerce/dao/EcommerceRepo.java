package com.example.ecommerce.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.*;

/*repo-i/f because it sends and recieves data from and to mysql*/
public interface EcommerceRepo extends JpaRepository<Ecommerce,Integer> {
	
	

}
