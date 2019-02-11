package com.capgemini.mobilePurchaseProject.repo;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.mobilePurchaseProject.bean.MobileDetail;


public class RepositoryMobile {
	int mobileId;
	public static Map<Integer, MobileDetail> map = new HashMap<Integer, MobileDetail>();
	
	public RepositoryMobile()
	{
		//public MobileDetail( int quantity, String mobileName, int price)
	map.put(100, new MobileDetail(2000,"Nokia",10000));
	map.put(200, new MobileDetail(2000,"mokia",20000));
	map.put(300, new MobileDetail(2000,"sokia",30000));
	map.put(400, new MobileDetail(2000,"dokia",40000));
	map.put(500, new MobileDetail(2000,"fokia",50000));
	map.put(600, new MobileDetail(2000,"pokia",60000));
	map.put(700, new MobileDetail(2000,"tokia",70000));

}

	
	
}

