package com.onlinebankingsystem.entity;

import java.math.BigDecimal;

import com.lowagie.text.pdf.PdfPCell;

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
public class BankAccountTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Many-to-One mapping with BankAccount
	@ManyToOne
	@JoinColumn(name = "bank_account_id")
	private BankAccount bankAccount;

	private String type; // withdraw, deposit, account transfer

	private String transactionId;   // unique transaction id
	
	private BigDecimal amount;

	// Many-to-One mapping with BankAccount (Destination Account for Account Transfer)
	@ManyToOne
	@JoinColumn(name = "destination_bank_account_id")
	private BankAccount destinationBankAccount;

	private String transactionTime;

	private String narration;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BankAccount getDestinationBankAccount() {
		return destinationBankAccount;
	}

	public void setDestinationBankAccount(BankAccount destinationBankAccount) {
		this.destinationBankAccount = destinationBankAccount;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

//	public void setType(String value) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setBank(Bank bank2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setBankAccount(BankAccount account) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setAmount(BigDecimal amount2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setNarration(String value) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setTransactionId(String generate) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setTransactionTime(String valueOf) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setUser(User user2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setDestinationBankAccount(BankAccount reciepentAccount) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public Object getBankAccount() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public PdfPCell getTransactionId() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public PdfPCell getType() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public char[] getAmount() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object getDestinationBankAccount() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String getTransactionTime() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public PdfPCell getNarration() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object getBank() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public Object getUser() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
