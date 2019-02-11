package com.capgemini.mobilePurchaseProject.bean;

public class Coustomer {
	private String coustomerName;
	private String mailId;
	private long phoneNumber;
	public String getCoustomerName() {
		return coustomerName;
	}
	public void setCoustomerName(String coustomerName) {
		this.coustomerName = coustomerName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Coustomer(String coustomerName, String mailId, long phoneNumber) {
		super();
		this.coustomerName = coustomerName;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Coustomer [coustomerName=" + coustomerName + ", mailId=" + mailId + ", phoneNumber=" + phoneNumber
				+ "]";
	}

}