package com.labManual.ques6.b;
import com.labManual.ques6.b.Account;
import com.labManual.ques6.b.Person;
public class Ques6b {
public static void main(String[] args)   {
	//System.out.println("enter details");
	Person p1 =new Person("Ashish",22.0f);
	Person p2= new Person("Bhatia",14);
	Account obj=new Account(123456,200000.0d,p1);
	Account obj2=new Account(123457,200000.0d,p2);
	System.out.println(obj);
	try {
	p1.method();
	System.out.println("----------------------------------------------");
	p2.method();
	}
	finally {
		System.out.println("main finally will run");
	}
}
}


