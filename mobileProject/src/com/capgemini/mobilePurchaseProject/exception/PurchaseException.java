package com.capgemini.mobilePurchaseProject.exception;

import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;
import com.capgemini.mobilePurchaseProject.repo.*;

public class PurchaseException {
	
@SuppressWarnings("serial")
public void exception(purchaseDetail purchaseDetailObj) throws availabilityException , QuantityException
{

	//RepositoryMobile mobileDataObj = new RepositoryMobile();
	
	int mobileId = purchaseDetailObj.getMobileId();
	if(!(RepositoryMobile.map.containsKey(mobileId)))
	{
		throw new availabilityException("mobile id that you entered does not exist in a database");
	}
	else if( RepositoryMobile.map.get(mobileId).getQuantity()-purchaseDetailObj.getQuantityPurchase()<0 )
	{
		throw new QuantityException("mobile quantity you want to purchase is greater than the available mobile  ");
	}
	
	
	
}
}
