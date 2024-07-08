package com.onlinebankingsystem.dto;

import lombok.Data;

@Data
public class BankAccountStatusUpdateRequestDto { 
	
	private int accountId;
	
	private String status;

	public int getAccountId() {
		// TODO Auto-generated method stub
		return accountId;
	}

	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

}
