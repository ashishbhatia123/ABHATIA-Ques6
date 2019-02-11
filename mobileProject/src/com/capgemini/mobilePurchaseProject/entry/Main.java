package com.capgemini.mobilePurchaseProject.entry;

import java.util.Scanner;
import java.util.Scanner.*;

import com.capgemini.mobilePurchaseProject.bean.MobileDetail;
import com.capgemini.mobilePurchaseProject.service.*;
public class Main {
public static void main(String[] args) {
	Logic logObj= new Logic();
while(true)
{
System.out.println("1- show available mobile \n 2- purchase \n 3- show purchase list 4- delete \n 5- add \n 6 - search \n 7 - exit");
Scanner scanner = new Scanner(System.in);
int n=scanner.nextInt();


switch(n)
{
case 1:
{logObj.showAvailableMobile();
break;

}
case 2:
{
	logObj.purchase();
	break;
}
case 3:
{
	logObj.showPurchaseMobile();
}
case 7:
{
	System.exit(0);
}

default:
{
	System.out.println("wrong input");
}

}
	
}
}
}