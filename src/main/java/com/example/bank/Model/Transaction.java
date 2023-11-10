package com.example.bank.Model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transaction_id;
    private Long RRN;
    private String TransactionCode;
    private String AccountNumber;
    private String Side;
    private BigDecimal Amount;
    private String ResponseCode;
    private Date TransactionDate;


	public Transaction() {
		super();
	}

	public Long getRRN() {
		return RRN;
	}

	public void setRRN(Long rRN) {
		RRN = rRN;
	}

	public String getTransactionCode() {
		return TransactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		TransactionCode = transactionCode;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getSide() {
		return Side;
	}

	public void setSide(String side) {
		Side = side;
	}

	public BigDecimal getAmount() {
		return Amount;
	}

	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}

	public String getResponseCode() {
		return ResponseCode;
	}

	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}

	public Date getTransactionDate() {
		return TransactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		TransactionDate = transactionDate;
	}

	@Override
	public String toString() {
		return "Transaction [RRN=" + RRN + ", TransactionCode=" + TransactionCode + ", AccountNumber=" + AccountNumber
				+ ", Side=" + Side + ", Amount=" + Amount + ", ResponseCode=" + ResponseCode + ", TransactionDate="
				+ TransactionDate + "]";
	}

    
}

