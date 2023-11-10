package com.example.bank.Model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class MobileBankingUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MobileBankingUser_id;
    private Long CIF;
    private String UserName;
    private String PIN;
    private String Password;
    private String PhoneNumber;
    private int Version;
    private String Language;


	public MobileBankingUser() {
		super();
	}

	public Long getCIF() {
		return CIF;
	}

	public void setCIF(Long cIF) {
		CIF = cIF;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPIN() {
		return PIN;
	}

	public void setPIN(String pIN) {
		PIN = pIN;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public int getVersion() {
		return Version;
	}

	public void setVersion(int version) {
		Version = version;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	@Override
	public String toString() {
		return "MobileBankingUser [CIF=" + CIF + ", UserName=" + UserName + ", PIN=" + PIN + ", Password=" + Password
				+ ", PhoneNumber=" + PhoneNumber + ", Version=" + Version + ", Language=" + Language + "]";
	}

    
}

