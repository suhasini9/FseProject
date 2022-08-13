package com.fse.microservices.componentprocessing.service;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fse.microservices.componentprocessing.bean.ProcessResponse;
import com.fse.microservices.componentprocessing.repository.ComponentProcessingRepository;

@Service
public class ComponentProcessingServiceImpl implements ComponentProcessingService {
	
	@Autowired
	ComponentProcessingRepository componentProcessingRepository;

	@Override
	public ProcessResponse getComponentProcessingDetailsForIntegral() {
		Random random = new Random();
		ProcessResponse processResponse = new ProcessResponse();
		processResponse.setRequestId(Math.abs(random.nextLong()));
		LocalDate date =LocalDate.now();
		processResponse.setDateOfDelivery(date.plusDays(5));
		processResponse.setProcessingCharge(500);
		return processResponse;
	}

	@Override
	public ProcessResponse getComponentProcessingDetailsForAccessory() {
		Random random = new Random();
		ProcessResponse processResponse = new ProcessResponse();
		processResponse.setRequestId(Math.abs(random.nextLong()));
		LocalDate date =LocalDate.now();
		processResponse.setDateOfDelivery(date.plusDays(2));
		processResponse.setProcessingCharge(300);
		return processResponse;
	}

	@Override
	public void completeProcessing(ProcessResponse processResponse) {
		// TODO Auto-generated method stub
		componentProcessingRepository.save(processResponse);
	}

	@Override
	public ProcessResponse viewProcessingDetails(long requestId) {
		// TODO Auto-generated method stub
		return componentProcessingRepository.getById(requestId);
	}


	
}
