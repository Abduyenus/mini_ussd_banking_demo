package com.example.bank.Model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private Long CIF;
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private String Salutation;
    private String Email;
    private Date Dob;
    private String PostalAddress;
    private String City;
    private String Country;
    private String HomePhone;
    private String MobilePhone;

    @OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private List<Account> accounts;

	public Customer() {

	}

	public Customer(int customer_id, Long cIF, String firstName, String middleName, String lastName, String salutation,
			String email, Date dob, String postalAddress, String city, String country, String homePhone,
			String mobilePhone, List<Account> accounts) {
		CIF = cIF;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Salutation = salutation;
		Email = email;
		Dob = dob;
		PostalAddress = postalAddress;
		City = city;
		Country = country;
		HomePhone = homePhone;
		MobilePhone = mobilePhone;
	}



	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Long getCIF() {
		return CIF;
	}

	public void setCIF(Long cIF) {
		this.CIF = cIF;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		this.MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getSalutation() {
		return Salutation;
	}

	public void setSalutation(String salutation) {
		this.Salutation = salutation;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public Date getDob() {
		return Dob;
	}

	public void setDob(Date dob) {
		this.Dob = dob;
	}

	public String getPostalAddress() {
		return PostalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.PostalAddress = postalAddress;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		this.City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public String getHomePhone() {
		return HomePhone;
	}

	public void setHomePhone(String homePhone) {
		this.HomePhone = homePhone;
	}

	public String getMobilePhone() {
		return MobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.MobilePhone = mobilePhone;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", CIF=" + CIF + ", FirstName=" + FirstName + ", MiddleName="
				+ MiddleName + ", LastName=" + LastName + ", Salutation=" + Salutation + ", Email=" + Email + ", Dob="
				+ Dob + ", PostalAddress=" + PostalAddress + ", City=" + City + ", Country=" + Country + ", HomePhone="
				+ HomePhone + ", MobilePhone=" + MobilePhone + ", accounts=" + accounts + "]";
	}

}
