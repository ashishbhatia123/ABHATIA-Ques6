
		package com.labManual.ques6.b;

import com.labManual.ques6.b.Person;

public class Account
{
	public long accNum;
	public double balance;
	public Person accHolder;
	Account(long accNum, double balance ,Person accHolder)
	{
		this.accNum=accNum;
		this.balance= balance;
		this.accHolder=accHolder;
	}
	Account(){
		
	}
	
	void  deposit(double amount)
	{
		this.balance= this.balance+amount;
	}
	void   withdraw(double amount)
	{ 
		if(this.balance-amount>500)
		{
			this.balance=this.balance-amount;
		}
		else
			System.out.println("withdrawl is not possible");
	
		
	}
	
			public long getAccNum() {
				return accNum;
			}
			public void setAccNum(long accNum) {
				this.accNum = accNum;
			}
		
		public Person getAccHolder() {
		return accHolder;
		}
		public void setAccHolder(Person accHolder) {				
			this.accHolder = accHolder;
		}
			
			public double getBalance() {
			return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
				}

			@Override
			public String toString() {
				return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
			}
		
	
}