package com.capgemini.mobilePurchaseProject.service;
import java.time.LocalDate;

import  com.capgemini.mobilePurchaseProject.exception.*;
import java.util.Scanner;
import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;
import com.capgemini.mobilePurchaseProject.bean.Coustomer;
import com.capgemini.mobilePurchaseProject.bean.MobileDetail;
import com.capgemini.mobilePurchaseProject.repo.*;

public class Logic implements ILogic {
static int purchaseId=0;
RepositoryMobile mobileDataObj = new RepositoryMobile();

	@Override
public void showAvailableMobile() {
	// TODO Auto-generated method stub
		System.out.printf("%-20s %-20s %-20s %-20s","MobileId","quantity","mobileName","price");
		System.out.println("\n");
		System.out.println("=====================================================================================");
		for(Integer mobileKey :RepositoryMobile.map.keySet())
		{
			String key = mobileKey.toString();
			String value =RepositoryMobile.map.get(mobileKey).toString();
			System.out.println(key +"  "+value);
			System.out.println("------------------------------------------------------------------");
		}
		System.out.println("=====================================================================================");
}

	@Override
	public void purchase() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter coustomer name ");
		String name = scanner.nextLine();
		System.out.println(" enter mail id");
		String mailId = scanner.nextLine();
		System.out.println("enter phone number ");
		long pNumber= scanner.nextLong();
		System.out.println("Quantity you want to purchase");
		int quantity = scanner.nextInt();
		System.out.println(" mobile id");
		int mobileIdObj = scanner.nextInt();
		
		
		purchaseId= purchaseId+1;
		
	  purchaseDetail purchaseDetailObj= new purchaseDetail(new Coustomer(name,mailId,pNumber), LocalDate.now(),mobileIdObj,quantity);
	  PurchaseException expObj =new PurchaseException();
	//  RepositoryMobile mobileDataObj = new RepositoryMobile();

	  try
	  {
	  expObj.exception(purchaseDetailObj);
	  System.out.println("a"+ RepositoryMobile.map.get(mobileIdObj).getQuantity());
	  System.out.println("b"+ purchaseDetailObj.getQuantityPurchase());
	  RepositoryMobile.map.get(mobileIdObj).setQuantity(RepositoryMobile.map.get(mobileIdObj).getQuantity()-purchaseDetailObj.getQuantityPurchase());
	  RepositoryPurchase repoPurchaseObj = new RepositoryPurchase(purchaseId, purchaseDetailObj);
	  System.out.println(RepositoryPurchase.purchaseMap);
	
	  }
	  catch(QuantityException e)
	  {
		  System.out.println(e);
		  System.out.println(e.getMessage());
		  System.exit(0);
	  }
	  catch(availabilityException e)
		{
		  System.out.println(e);
			//System.out.println(e.getMessage());
			System.exit(0);
		}
	  
		
	}

	@Override
	public void showPurchaseMobile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long mobileId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(MobileDetail mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(int range1, int range2) {
		// TODO Auto-generated method stub
		
	}

}