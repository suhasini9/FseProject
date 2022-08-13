package com.fse.microservices.packaginganddelivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fse.microservices.packaginganddelivery.service.PackagingAndDeliveryService;

@RestController
public class PackagingAndDeliveryController {
	
	@Autowired
	PackagingAndDeliveryService  packagingAndDeliveryService;
	
	@GetMapping("/getPackagingAndDeliveryCharges/{inputType}/{quantity}")
	public int getPackagingAndDeliveryCharges(@PathVariable String inputType, @PathVariable int quantity) {
		
		return packagingAndDeliveryService.getPackagingAndDeliveryService(inputType, quantity);
		
	}
	

}
