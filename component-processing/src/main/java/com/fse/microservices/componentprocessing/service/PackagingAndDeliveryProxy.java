package com.fse.microservices.componentprocessing.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="packaging-and-delivery",url="localhost:8082")
@FeignClient(name="packaging-and-delivery")
public interface PackagingAndDeliveryProxy {
	
	@GetMapping("/getPackagingAndDeliveryCharges/{inputType}/{quantity}")
	public int getPackagingAndDeliveryCharges(@PathVariable String inputType,@PathVariable int quantity);

}
