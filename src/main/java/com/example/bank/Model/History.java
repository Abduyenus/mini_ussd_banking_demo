package com.example.bank.Model;

import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int history_id;
    private Long RRN;
    private String TransactionCode;
    private String Side;
    private BigDecimal Amount;
    private String ResponseCode;
    private Date TransactionDate;
    private String PhoneNumber;

	public History() {
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

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "History [RRN=" + RRN + ", TransactionCode=" + TransactionCode + ", Side=" + Side + ", Amount=" + Amount
				+ ", ResponseCode=" + ResponseCode + ", TransactionDate=" + TransactionDate + ", PhoneNumber="
				+ PhoneNumber + "]";
	}

    
}

