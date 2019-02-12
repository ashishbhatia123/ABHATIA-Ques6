package com.capgemini.paytmWallet.service;

import java.math.BigDecimal;
import java.util.List;

import com.capgemini.paytmWallet.bean.Coustomer;


public interface IwalletService {
public abstract Coustomer createAccount (String name,String phoneNo,BigDecimal amount);
public abstract Coustomer showBalance(String phoneNo);
public abstract Boolean   delete(String phoneNo);
public abstract  List<Coustomer> findAll();
public abstract Boolean update(Coustomer c);



}
