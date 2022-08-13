package com.fse.microservices.springcloudapigateway.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ErrorResponseDto implements Serializable {
    private Date timestamp;
    private int status;
    private String error;
    private List<String> details;
    private String path;
	public ErrorResponseDto(Date timestamp, int status, String error, List<String> details, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.details = details;
		this.path = path;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
    
    
}
