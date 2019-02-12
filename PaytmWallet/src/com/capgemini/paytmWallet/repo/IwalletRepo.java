package com.capgemini.paytmWallet.repo;

import java.util.List;

import com.capgemini.paytmWallet.bean.Coustomer;

public interface IwalletRepo {
public abstract boolean save(Coustomer c);
public abstract Coustomer findByPhone(String phoneNo);
public abstract Boolean delete(String phoneNo);

public abstract List<Coustomer> findAll();
public abstract Boolean update(Coustomer c);
}
