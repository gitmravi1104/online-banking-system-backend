package com.onlinebankingsystem.dto;

import java.util.List;

import com.onlinebankingsystem.entity.BankAccount;

import lombok.Data;

@Data
public class BankAccountResponseDto extends CommonApiResponse {
	
	private List<BankAccount> accounts;

	public void setAccounts(List<BankAccount> accounts2) {
		// TODO Auto-generated method stub
		
	}

	public void setResponseMessage(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSuccess(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
