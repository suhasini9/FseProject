package com.fse.microservices.springcloudapigateway.model;

import java.io.Serializable;


public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private String jwtToken;
	public JwtResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
