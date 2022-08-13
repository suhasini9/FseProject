package com.fse.microservices.componentprocessing.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fse.microservices.componentprocessing.bean.ProcessResponse;
import com.fse.microservices.componentprocessing.service.ComponentProcessingService;
import com.fse.microservices.componentprocessing.service.PackagingAndDeliveryProxy;
import org.slf4j.Logger;


@RestController
public class ComponentProcessingController {
	
	@Autowired
	ComponentProcessingService componentProcessingService;
	
	@Autowired
	PackagingAndDeliveryProxy packagingAndDeliveryProxy;
	
	Logger log=LoggerFactory.getLogger(ComponentProcessingController.class);
	@GetMapping("/getComponentProcessingDetails/{username}/{contact}/{componentType}/{componentName}/{quantity}")
	public ProcessResponse getComponentProcessingDetails(@PathVariable String username,@PathVariable long contact,@PathVariable String componentType,@PathVariable String componentName,@PathVariable int quantity)
	{
		ProcessResponse processResponse = new ProcessResponse();
        if(componentType.equalsIgnoreCase("Integral")) {
        	processResponse = componentProcessingService.getComponentProcessingDetailsForIntegral();
        }
        else if(componentType.equalsIgnoreCase("Accessory")) {
        	processResponse = componentProcessingService.getComponentProcessingDetailsForAccessory();
        }
        processResponse.setUsername(username);
        processResponse.setContact(contact);
        processResponse.setComponentName(componentName);
        processResponse.setComponentType(componentType);
        processResponse.setQuantity(quantity);
        processResponse.setPackagingAndDeliveryCharge(packagingAndDeliveryProxy.getPackagingAndDeliveryCharges(componentType, quantity));
		return processResponse;
	}
	
	@PostMapping("/completeProcessing")
	public void completeProcessing(@RequestBody ProcessResponse processResponse){
		log.info("process response of ",processResponse);
		 componentProcessingService.completeProcessing(processResponse);
	}
	
	@GetMapping("/viewRequestDetails/{requestId}")
	public ProcessResponse viewRequestDetails(@PathVariable long requestId) {
		
		return componentProcessingService.viewProcessingDetails(requestId);
		
	}
}
