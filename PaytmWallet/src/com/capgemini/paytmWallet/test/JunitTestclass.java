package com.capgemini.paytmWallet.test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import com.capgemini.paytmWallet.bean.Coustomer;
import com.capgemini.paytmWallet.bean.Wallet;
import com.capgemini.paytmWallet.repo.IwalletRepo;
import com.capgemini.paytmWallet.repo.WalletRepoImpli;
import com.capgemini.paytmWallet.service.IwalletService;
import com.capgemini.paytmWallet.service.WalletServiceImpli;

public class JunitTestclass {

	IwalletRepo repoObj = new WalletRepoImpli();
	IwalletService serviceObj = new WalletServiceImpli();
	@Test
	public void test() {
		serviceObj.createAccount("ashish", "9458207565", new BigDecimal(10005));
		Coustomer c= new Coustomer("bhatia", "9458207565", new Wallet(new BigDecimal(999999)));
		boolean flag=serviceObj.update(c);
		System.out.print(flag);
		assertTrue(flag);
	}

}
