
package com.onlinebankingsystem.dto;

import com.onlinebankingsystem.exception.GlobalExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

@Builder

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommonApiResponse {


	private String responseMessage;
	private boolean isSuccess;
	
	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	

	public static GlobalExceptionHandler builder() {
		// TODO Auto-generated method stub
		return null;
	}	

}
