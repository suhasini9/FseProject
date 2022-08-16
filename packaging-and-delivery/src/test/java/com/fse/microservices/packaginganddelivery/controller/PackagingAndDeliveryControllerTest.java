package com.fse.microservices.packaginganddelivery.controller;


import com.fse.microservices.packaginganddelivery.service.PackagingAndDeliveryServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PackagingAndDeliveryControllerTest {

    @InjectMocks
    PackagingAndDeliveryController packagingAndDeliveryController;

    @Mock
    PackagingAndDeliveryServiceImpl packagingAndDeliveryService;

    @Test
    public void getPackagingAndDeliveryCharges(){
        Mockito.when(packagingAndDeliveryService.getPackagingAndDeliveryService("Integral",2)).thenReturn(500);
        int result = packagingAndDeliveryController.getPackagingAndDeliveryCharges("Integral",2);
        Assert.assertEquals(result,500);
    }
}
