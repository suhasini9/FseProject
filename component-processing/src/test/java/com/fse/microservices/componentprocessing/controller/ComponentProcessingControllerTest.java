package com.fse.microservices.componentprocessing.controller;

import com.fse.microservices.componentprocessing.service.PackagingAndDeliveryProxy;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.fse.microservices.componentprocessing.bean.ProcessResponse;
import com.fse.microservices.componentprocessing.service.ComponentProcessingServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class ComponentProcessingControllerTest {
	
	@InjectMocks
	private ComponentProcessingController componentProcessingController;
	
	@Mock
	private ComponentProcessingServiceImpl componentProcessingService;

	@Mock
	private PackagingAndDeliveryProxy packagingAndDeliveryProxy;

	
	public ProcessResponse componentProcessingDetailsForIntegral() {
		ProcessResponse processResponse = new ProcessResponse();
		processResponse.setComponentName("tire");
		processResponse.setComponentType("Integral");
		processResponse.setPackagingAndDeliveryCharge(500);
		processResponse.setProcessingCharge(500);
		return processResponse;
	}
	
	@Test
	public void getComponentProcessingDetails() {
		Mockito.when(packagingAndDeliveryProxy.getPackagingAndDeliveryCharges("integral",2)).thenReturn(500);
		Mockito.when(componentProcessingService.getComponentProcessingDetailsForIntegral()).thenReturn(componentProcessingDetailsForIntegral());
		ProcessResponse processResponse=componentProcessingController.getComponentProcessingDetails("test", 12345, "Integral", "test", 2);
		Assert.assertNotNull(processResponse);
	}

	@Test
	public void viewProcessingDetails() {
		Mockito.when(componentProcessingService.viewProcessingDetails(1)).thenReturn(componentProcessingDetailsForIntegral());
		ProcessResponse processResponse=componentProcessingController.viewRequestDetails(1);
		Assert.assertNotNull(processResponse);
	}

	@Test
	public void completeProcessing() {
		componentProcessingController.completeProcessing(componentProcessingDetailsForIntegral());
		Assert.assertTrue(true);
	}

}
