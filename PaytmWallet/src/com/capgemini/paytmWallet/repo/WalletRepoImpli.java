package com.capgemini.paytmWallet.repo;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.paytmWallet.bean.Coustomer;

public class WalletRepoImpli implements IwalletRepo {

	public static List<Coustomer> listobj = new LinkedList<Coustomer>();
	@Override
	public boolean save(Coustomer c) {
		for(Coustomer i : listobj)
		{
			if(i.getPhone().equals(c.getPhone()))
			{
				return false;
				
			}
		}
		listobj.add(c);
		return true;
	}

	@Override
	public Coustomer findByPhone(String phoneNo) {
		for(Coustomer i : listobj)
		{
			if(i.getPhone().equals(phoneNo))
			{
				return i;
				
			}
		}
		
		return null;
	}

	@Override
	public Boolean delete(String phoneNo) {
		// TODO Auto-generated method stub
		for(Coustomer i : listobj)
		{
			if(i.getPhone().equals(phoneNo))
			{
				return listobj.remove(i);
				
			}
		}

		return false;
	}

	@Override
	public List<Coustomer> findAll() {
		// TODO Auto-generated method stub
		
		return listobj;
	}

	@Override
	public Boolean update(Coustomer c) {
		// TODO Auto-generated method stub
		for(Coustomer i : listobj)
		{
			if(i.getPhone().equals(c.getPhone()))
			{
				i.setName(c.getName());
				i.setWallet(c.getWallet());
				return true;
			}
		}
		
		return false;
	}
	

}
