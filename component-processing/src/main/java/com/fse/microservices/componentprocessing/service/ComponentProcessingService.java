package com.fse.microservices.componentprocessing.service;

import com.fse.microservices.componentprocessing.bean.ProcessResponse;

public interface ComponentProcessingService {
	ProcessResponse getComponentProcessingDetailsForIntegral();

	ProcessResponse getComponentProcessingDetailsForAccessory();

	void completeProcessing(ProcessResponse processResponse);

	ProcessResponse viewProcessingDetails(long requestId);
}
