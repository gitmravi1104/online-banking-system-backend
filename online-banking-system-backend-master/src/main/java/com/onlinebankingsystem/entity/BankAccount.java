package com.onlinebankingsystem.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String number;

	private String ifscCode;

	private String type; // saving or current

	private BigDecimal balance;
	
	private String creationDate;

	private String status; // open, in-operative, deleted

	// Many-to-One mapping with Bank
	@ManyToOne
	@JoinColumn(name = "bank_id")
	private Bank bank;

	// One-to-One mapping with User
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user; // 1 user can 1 bank account

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

//	public void setStatus(Object status2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setBalance(BigDecimal zero) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setCreationDate(String valueOf) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setBank(Bank bank2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setUser(User user2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public Object getStatus() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Bank getBank() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public BigDecimal getBalance() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public User getUser() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public int getId() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
