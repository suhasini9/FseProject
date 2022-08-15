package com.fse.microservices.componentprocessing.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class ProcessResponse {
	
	@Id
	@Column(name="REQUEST_ID")
	private long requestId;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="CONTACT")
	private long contact;
	
	@Column(name="COMPONENT_TYPE")
	private String componentType;
	
	@Column(name="COMPONENT_NAME")
	private String componentName;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="PROCESSING_CHARGE")
	private double processingCharge;
	
	@Column(name="PACKAGING_AND_DELIVERY_CHARGE")
	private double packagingAndDeliveryCharge;
	
	@Column(name="DATE_OF_DELIVERY")
	private LocalDate dateOfDelivery;
	
	
	
	public ProcessResponse(long requestId, String username, long contact, String componentType, String componentName,
			int quantity, double processingCharge, double packagingAndDeliveryCharge, LocalDate dateOfDelivery) {
		super();
		this.requestId = requestId;
		this.username = username;
		this.contact = contact;
		this.componentType = componentType;
		this.componentName = componentName;
		this.quantity = quantity;
		this.processingCharge = processingCharge;
		this.packagingAndDeliveryCharge = packagingAndDeliveryCharge;
		this.dateOfDelivery = dateOfDelivery;
	}

	public ProcessResponse() {
		// TODO Auto-generated constructor stub
	}

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getComponentType() {
		return componentType;
	}

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getProcessingCharge() {
		return processingCharge;
	}

	public void setProcessingCharge(double processingCharge) {
		this.processingCharge = processingCharge;
	}

	public double getPackagingAndDeliveryCharge() {
		return packagingAndDeliveryCharge;
	}

	public void setPackagingAndDeliveryCharge(double packagingAndDeliveryCharge) {
		this.packagingAndDeliveryCharge = packagingAndDeliveryCharge;
	}

	public LocalDate getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(LocalDate dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}


	
	
	

}
