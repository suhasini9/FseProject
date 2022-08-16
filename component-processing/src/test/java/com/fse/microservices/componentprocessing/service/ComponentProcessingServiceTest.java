package com.fse.microservices.componentprocessing.service;

import com.fse.microservices.componentprocessing.bean.ProcessResponse;
import com.fse.microservices.componentprocessing.repository.ComponentProcessingRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class ComponentProcessingServiceTest {
    @InjectMocks
    ComponentProcessingServiceImpl componentProcessingService;

    @Mock
    ComponentProcessingRepository componentProcessingRepository;

    private ProcessResponse componentProcessingDetails() {
        ProcessResponse processResponse = new ProcessResponse();
        processResponse.setComponentName("tire");
        processResponse.setComponentType("Accessory");
        processResponse.setPackagingAndDeliveryCharge(500);
        processResponse.setProcessingCharge(500);
        return processResponse;
    }

    @Test
    public void getComponentProcessingDetailsForIntegral(){
        ProcessResponse processResponse = componentProcessingService.getComponentProcessingDetailsForIntegral();
        Assert.assertNotNull(processResponse);
    }

    @Test
    public void getComponentProcessingDetailsForAccessory(){
        ProcessResponse processResponse = componentProcessingService.getComponentProcessingDetailsForAccessory();
        Assert.assertNotNull(processResponse);
    }

    @Test
    public void viewProcessingDetails(){
        Mockito.when(componentProcessingRepository.findById(1L)).thenReturn(Optional.of(componentProcessingDetails()));
        ProcessResponse processResponse = componentProcessingService.viewProcessingDetails(1);
        Assert.assertNotNull(processResponse);
    }

    @Test
    public void completeProcessing(){
        componentProcessingService.completeProcessing(componentProcessingDetails());
        Assert.assertTrue(true);
    }
}
