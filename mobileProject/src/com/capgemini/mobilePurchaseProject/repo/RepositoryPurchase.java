package com.capgemini.mobilePurchaseProject.repo;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.mobilePurchaseProject.bean.purchaseDetail;

public class RepositoryPurchase {
	int purchaseId;
	purchaseDetail purchaseDetailObj;
	public static Map<Integer,purchaseDetail > purchaseMap = new HashMap<Integer,purchaseDetail>();
	public RepositoryPurchase(int purchaseId, purchaseDetail purchaseDetailObj) {
		super();
		
		purchaseMap.put(purchaseId, purchaseDetailObj);
	}
	

}
