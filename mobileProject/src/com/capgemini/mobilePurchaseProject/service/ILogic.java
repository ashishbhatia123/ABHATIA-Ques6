
package com.capgemini.mobilePurchaseProject.service;

import com.capgemini.mobilePurchaseProject.bean.MobileDetail;

public interface ILogic {
	public void showAvailableMobile();
public void purchase();
public void showPurchaseMobile();
public void delete(long mobileId);
public void add(MobileDetail mobile);
public void search(int range1, int range2);
}