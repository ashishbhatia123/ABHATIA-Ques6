package com.capgemini.paytmWallet.bean;

public class Coustomer {
private String name;
private String phone;
private Wallet wallet;
public Coustomer(String name, String phone, Wallet wallet) {
	super();
	this.name = name;
	this.phone = phone;
	this.wallet = wallet;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public Wallet getWallet() {
	return wallet;
}
public void setWallet(Wallet wallet) {
	this.wallet = wallet;
}
@Override
public String toString() {
	return "Coustomer [name=" + name + ", phone=" + phone + ", wallet=" + wallet + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	result = prime * result + ((wallet == null) ? 0 : wallet.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Coustomer other = (Coustomer) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (phone == null) {
		if (other.phone != null)
			return false;
	} else if (!phone.equals(other.phone))
		return false;
	if (wallet == null) {
		if (other.wallet != null)
			return false;
	} else if (!wallet.equals(other.wallet))
		return false;
	return true;
} 

}
