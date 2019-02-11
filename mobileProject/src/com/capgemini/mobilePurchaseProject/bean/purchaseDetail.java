package com.capgemini.mobilePurchaseProject.bean;
import java.time.LocalDate;
import com.capgemini.mobilePurchaseProject.bean.Coustomer;

public class purchaseDetail {
private Coustomer cous_detail;
private LocalDate  date;
private int mobileId;
private int quantityPurchase;
public purchaseDetail(Coustomer cous_detail, LocalDate date, int mobileId, int quantityPurchase) {
	super();
	this.cous_detail = cous_detail;
	this.date = date;
	this.mobileId = mobileId;
	this.quantityPurchase = quantityPurchase;
}
public Coustomer getCous_detail() {
	return cous_detail;
}
public void setCous_detail(Coustomer cous_detail) {
	this.cous_detail = cous_detail;
}
public LocalDate getDate() {
	return date;
}
@Override
public String toString() {
	return "purchaseDetail [cous_detail=" + cous_detail + ", date=" + date + ", mobileId=" + mobileId
			+ ", quantityPurchase=" + quantityPurchase + "]";
}
public void setDate(LocalDate date) {
	this.date = date;
}                                                                    
public int getMobileId() {                                           
	return mobileId;                                                 
}                                                                    
public void setMobileId(int mobileId) {                              
	this.mobileId = mobileId;                                        
}                                                                    
public int getQuantityPurchase() {                                   
	return quantityPurchase;                                         
}                                                                    
public void setQuantityPurchase(int quantityPurchase) {              
	this.quantityPurchase = quantityPurchase;                        
}                                                                    
                                                                     
                                                                     




}