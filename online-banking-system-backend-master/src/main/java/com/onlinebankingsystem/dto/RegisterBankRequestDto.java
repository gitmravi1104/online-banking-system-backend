package com.onlinebankingsystem.dto;

import org.springframework.beans.BeanUtils;

import com.onlinebankingsystem.entity.Bank;

import lombok.Data;

@Data
public class RegisterBankRequestDto {
	
	private int id;

	private String name;

	private String code; // unique bank code

	private String address;

	private String phoneNumber;

	private String email;

	private String website;

	private String country;

	private String currency;
	
	private int userId;  // bank user id who will manage this bank
	
	public static Bank toBankEntity(RegisterBankRequestDto registerBankRequestDto) {
		Bank bank =new Bank();
		BeanUtils.copyProperties(registerBankRequestDto, bank, "userId");		
		return bank;
	}

	public int getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

}
