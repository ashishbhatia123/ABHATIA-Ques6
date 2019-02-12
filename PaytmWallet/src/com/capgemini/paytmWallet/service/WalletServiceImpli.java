package com.capgemini.paytmWallet.service;

import java.math.BigDecimal;
import java.util.List;

import com.capgemini.paytmWallet.bean.Coustomer;
import com.capgemini.paytmWallet.bean.Wallet;
import com.capgemini.paytmWallet.repo.IwalletRepo;
import com.capgemini.paytmWallet.repo.WalletRepoImpli;

public class WalletServiceImpli  implements IwalletService{
 IwalletRepo repoObj  = new WalletRepoImpli();
	@Override
	public Coustomer createAccount(String name, String phoneNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		Coustomer c= new Coustomer(name, phoneNo , new Wallet(amount));
		
		
		if(repoObj.save(c))
		{
			return c;
		}
		return null;
	}

	@Override
	public Coustomer showBalance(String phoneNo) {
		// TODO Auto-generated method stub
	Coustomer c=repoObj.findByPhone(phoneNo);
	if (c!=null)
			{
		return c;
			}
	
		return null;
	}

	@Override
	public Boolean delete(String phoneNo) {
		// TODO Auto-generated method stub
		Boolean b=repoObj.delete(phoneNo);
		
		return b;
		
	}

	@Override
	public List<Coustomer> findAll() {
		// TODO Auto-generated method stub
		return repoObj.findAll();
	}

	@Override
	public Boolean update(Coustomer c) {
		// TODO Auto-generated method stub
		return repoObj.update(c);
		
	}

	

}
