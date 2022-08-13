package com.fse.microservices.packaginganddelivery.service;

import org.springframework.stereotype.Service;

@Service
public class PackagingAndDeliveryServiceImpl implements PackagingAndDeliveryService {

	@Override
	public int getPackagingAndDeliveryService(String inputType, int quantity) {
		int packagingCharge=0;
		int deliveryCharge=0;
		int protectiveSheath=50;
		if(inputType.equalsIgnoreCase("Integral")) {
			packagingCharge=100;
			deliveryCharge=200;
		}
		else if(inputType.equalsIgnoreCase("Accessory")) {
			packagingCharge=50;
			deliveryCharge=100;
		}
		return (packagingCharge + deliveryCharge + protectiveSheath)*quantity;
	}
}
