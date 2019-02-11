package com.capgemini.mobilePurchaseProject.bean;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MobileDetail {
private int mobileID;
private String mobileName;
private  int quantity;
private int price;

public int getMobileID() {
	return mobileID;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public void setMobileID(int mobileID) {
	this.mobileID = mobileID;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileNo(String mobileName) {
	this.mobileName = mobileName;
}

public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public MobileDetail( int quantity, String mobileName, int price) {
	super();
	
	this.quantity = quantity;
	this.mobileName = mobileName;
	this.price = price ;
}
@Override
public String toString() {
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	PrintStream ps = new PrintStream(baos);
	// IMPORTANT: Save the old System.out!
	PrintStream old = System.out;
	// Tell Java to use your special stream
	System.setOut(ps);
	// Print some output: goes to your special stream
	System.out.printf("%20d %20s %20d",quantity,mobileName,price);
	// Put things back
	System.out.flush();
	System.setOut(old);
	// Show what happened
	return( baos.toString());
	
//	System.out.printf("%20d,%20s, %20d",quantity,mobileName,price).toString();
//	return s;
//	return "MobileDetail [ quantity=" + quantity + ", mobileName=" + mobileName +" price="+ price+ "]";
}


}