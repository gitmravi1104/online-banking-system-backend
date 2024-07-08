package com.onlinebankingsystem.dto;

import org.springframework.beans.BeanUtils;

import com.onlinebankingsystem.entity.BankAccount;

import lombok.Data;

@Data
public class AddBankAccountRequestDto {
	
	private String number;

	private String ifscCode;

	private String type; // saving or current
	
	private int bankId;
	
	private int userId; // bank customer id
	
	public static BankAccount toBankAccountEntity(AddBankAccountRequestDto addBankAccountRequestDto) {
		BankAccount bankAccount =new BankAccount();
		BeanUtils.copyProperties(addBankAccountRequestDto, bankAccount, "bankId", "userId");		
		return bankAccount;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBankId() {
		// TODO Auto-generated method stub
		return bankId;
	}

	public int getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

}
