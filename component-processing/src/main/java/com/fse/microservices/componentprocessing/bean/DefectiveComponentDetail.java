package com.fse.microservices.componentprocessing.bean;

public class DefectiveComponentDetail {
	
	public DefectiveComponentDetail(String componetType, String componentName, int quantity) {
		super();
		componetType = componetType;
		componentName = componentName;
		this.quantity = quantity;
	}
	private String componetType;
	private String componentName;
	private int quantity;
	public String getComponetType() {
		return componetType;
	}
	public void setComponetType(String componetType) {
		componetType = componetType;
	}
	public String getComponentName() {
		return componentName;
	}
	public void setComponentName(String componentName) {
		componentName = componentName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
