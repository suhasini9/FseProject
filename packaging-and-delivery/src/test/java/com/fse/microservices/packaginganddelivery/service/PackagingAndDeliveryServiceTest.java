package com.fse.microservices.packaginganddelivery.service;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PackagingAndDeliveryServiceTest {

    @InjectMocks
    PackagingAndDeliveryServiceImpl packagingAndDeliveryService;

    @Test
    public void getPackagingAndDeliveryCharges(){
        int result=packagingAndDeliveryService.getPackagingAndDeliveryService("Integral",2);
        Assert.assertEquals(result,700);
    }
}
