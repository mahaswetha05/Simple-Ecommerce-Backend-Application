package com.example.ecommerce.controller;
import com.example.ecommerce.model.*;
import com.example.ecommerce.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommerceController {
	
	@Autowired
	EcommerceService es;
	
	@PostMapping("/addprod")
	public Ecommerce get1(@RequestBody Ecommerce e) {
		
		return es.addProduct(e);
	}

}
