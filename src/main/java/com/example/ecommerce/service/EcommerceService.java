package com.example.ecommerce.service;
import com.example.ecommerce.model.*;
import com.example.ecommerce.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EcommerceService {
	
	@Autowired
	EcommerceRepo er;
	
	public Ecommerce addProduct(Ecommerce e) {
		return er.save(e);
	}
	
	
}
