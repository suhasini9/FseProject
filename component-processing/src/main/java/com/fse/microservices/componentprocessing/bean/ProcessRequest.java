package com.fse.microservices.componentprocessing.bean;

public class ProcessRequest {

	private String username;
	private long contact;
	private String componetType;
	private String componentName;
	private int quantity;
	public ProcessRequest(String username, long contact, String componetType, String componentName, int quantity) {
		super();
		this.username = username;
		this.contact = contact;
		this.componetType = componetType;
		this.componentName = componentName;
		this.quantity = quantity;
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
	public String getComponetType() {
		return componetType;
	}
	public void setComponetType(String componetType) {
		this.componetType = componetType;
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
	
	
	
	
	

}
