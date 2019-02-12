package com.capgemini.paytmWallet.Entry;

import java.math.BigDecimal;
import java.util.List;

import com.capgemini.paytmWallet.bean.Coustomer;
import com.capgemini.paytmWallet.bean.Wallet;
import com.capgemini.paytmWallet.service.IwalletService;
import com.capgemini.paytmWallet.service.WalletServiceImpli;

public class Main {
	public static void main(String[] args) {
		IwalletService obj = new WalletServiceImpli();
		obj.createAccount("ashish", "9458207565", new BigDecimal(10005));
		obj.createAccount("ashish2", "9458207566", new BigDecimal(10006));
		obj.createAccount("ashish3", "9458207567", new BigDecimal(10007));
		obj.createAccount("ashish4", "9458207568", new BigDecimal(10008));
		obj.createAccount("ashish5", "9458207569", new BigDecimal(10009));
		obj.createAccount("ashish6", "9458207570", new BigDecimal(10010));
		
		System.out.printf("%15s%15s %20s\n", "name", "phoneNo", "amount");
		List<Coustomer> listObj = obj.findAll();
		for(Coustomer i : listObj)
		{
			System.out.println(i);
		}
		System.out.println("balance of 9458207565");
		System.out.println(obj.showBalance("9458207565").getWallet());
		Coustomer c= new Coustomer("bhatia", "9458207565", new Wallet(new BigDecimal(999999)));
		obj.update(c);
		if (obj.update(new Coustomer("tiwari ji ", "9458207570",new Wallet(new BigDecimal(10099)))))
		{
			System.out.println("value updated ");
		}
		else
		{
			System.out.println("failed to update");
		}
		System.out.printf("%15s%15s %20s\n", "name", "phoneNo", "amount");
		List<Coustomer> listObj2 = obj.findAll();
		for(Coustomer i : listObj2)
		{
			System.out.println(i);
		}
	}

}
