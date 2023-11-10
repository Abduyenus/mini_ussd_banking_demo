package com.example.bank.Model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountId;
	private Long CIF;
	private String AccountNumber;
	private Long Balance;
	private String AccountStatus;
	private Date CreatedDate;
	private Date UpdatedDate;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountId, Long cIF, String accountNumber, Long balance, String accountStatus, Date createdDate,
			Date updatedDate) {
		super();
		this.accountId = accountId;
		CIF = cIF;
		AccountNumber = accountNumber;
		Balance = balance;
		AccountStatus = accountStatus;
		CreatedDate = createdDate;
		UpdatedDate = updatedDate;
	}
	
	

	public Account(Long cIF, String accountNumber, Long balance, String accountStatus, Date createdDate,
			Date updatedDate) {
		CIF = cIF;
		AccountNumber = accountNumber;
		Balance = balance;
		AccountStatus = accountStatus;
		CreatedDate = createdDate;
		UpdatedDate = updatedDate;
	}

	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public Long getCIF() {
		return CIF;
	}
	public void setCIF(Long cIF) {
		this.CIF = cIF;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.AccountNumber = accountNumber;
	}
	public Long getBalance() {
		return Balance;
	}
	public void setBalance(Long balance) {
		this.Balance = balance;
	}
	public String getAccountStatus() {
		return AccountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.AccountStatus = accountStatus;
	}
	public Date getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.CreatedDate = createdDate;
	}
	public Date getUpdatedDate() {
		return UpdatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.UpdatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", CIF=" + CIF + ", AccountNumber=" + AccountNumber + ", Balance="
				+ Balance + ", AccountStatus=" + AccountStatus + ", CreatedDate=" + CreatedDate + ", UpdatedDate="
				+ UpdatedDate + "]";
	}

	
}
