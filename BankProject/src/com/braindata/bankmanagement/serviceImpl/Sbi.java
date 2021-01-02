package com.braindata.bankmanagement.serviceImpl;

import java.util.Scanner;

import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;

public class Sbi  implements Rbi {
	int count=0;
	Scanner sc=new Scanner(System.in);
	Account a=new Account();
    	
	public void createAccount()
	
	{
		System.out.println("Enter your Account Number.");
		String p=sc.next();
		a.setAccNo(p);
		System.out.println("Enter your Name.");
		String p1=sc.next();
		a.setName(p);
		System.out.println("Enter your Mobile no.");
		String p2=sc.next();
		a.setMobNo(p2);
		System.out.println("Enter your Aadhar no.");
		String p3=sc.next();
		a.setAdharNo(p3);
		System.out.println("Enter your Gender.");
		String p4=sc.next();
		a.setGender(p4);
		System.out.println("Enter your Age.");
		int p5=sc.nextInt();
		a.setAge(p5);
		
		while(true)
		{if(p5>=18) {
			a.setAge(p5);
			
		}else
		{System.out.println("Your Age is below 18");
		System.out.println("Enter your Age is greter than 18.");
		
		break;}
		System.out.println("Enter your Balance.");
		double p6=sc.nextDouble();
		while(p6>0) {
			
			if(p6>=500){a.setBalance(p6);
			break;
				
			}else 
			{
				System.out.println("Please enter balance greater than or equal to 500");
				System.out.println("Enter your Balance.");
				p6=sc.nextDouble();
			   }}
			 System.out.println("your Account is Succefuly Created");
		     System.out.println(".....................");
		      count++;
		      break;
		}}

	public void displayAllDetails()
	{if(count!=0)
	{
		 
		   System.out.println(a.getAccNo());
		   System.out.println(a.getName());
		   System.out.println(a.getMobNo());
		   System.out.println(a.getAdharNo());
		   System.out.println(a.getGender());
		   System.out.println(a.getAge());
		   System.out.println(a.getBalance());
		   System.out.println("...................");
		 
	}else
	{ 
		System.out.println("First create Account");
	}
		
	}
	public void depositeMoney()
	{if(count!=0)
	{System.out.println("Enter amount of Deposit ");
	double a1=sc.nextDouble();
	double totalAmount=(a.getBalance()) +a1;
	
	a.setBalance(totalAmount);
	
	}else
	{System.out.println("First create Account");
	}
	}
	
	public void withdrawal() 
	
		{if(count!=0)
	{System.out.println("Enter Withdrawal Amount");
	
	double a1=sc.nextDouble();
	
	double totalAmount=(a.getBalance()) -a1;{
		
	System.out.println("Total Balance is:");
	
	while(true) 
	
	{if (totalAmount>=500)
		
	{a.setBalance(totalAmount);
		break;} 
	else
		{System.out.println("please mentain minimum balance is 500");
		 System.out.println("Enter Withdrawal Amount");	
	     totalAmount=a.getBalance()-sc.nextDouble();
    	
		}}
	}
	
	}else
	{System.out.println("First create Account");
	}
	}
	
	public void balanceCheck()
	{if (count!=0)
	{System.out.println("your Total Balance is"+a.getBalance());
	
	}
	
	}
}
