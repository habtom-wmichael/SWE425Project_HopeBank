package edu.mum.cs.cs425.studentproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	
	private Long accountNumber;
	
	private Double balance;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AccountType accountType;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "user_id")
	private User accountUser;

	public Account() {
		
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public User getAccountUser() {
		return accountUser;
	}

	public void setAccountUser(User accountUser) {
		this.accountUser = accountUser;
	}
	
}
