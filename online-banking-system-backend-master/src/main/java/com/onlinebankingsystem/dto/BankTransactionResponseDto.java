package com.onlinebankingsystem.dto;

import java.util.ArrayList;
import java.util.List;

import com.onlinebankingsystem.entity.BankAccountTransaction;

import lombok.Data;

@Data
public class BankTransactionResponseDto extends CommonApiResponse {
	
	private List<BankAccountTransaction> bankTransactions= new ArrayList<>();

	public void setBankTransactions(List<BankAccountTransaction> bankAccountTransactions) {
		// TODO Auto-generated method stub
		
	} ;

}

