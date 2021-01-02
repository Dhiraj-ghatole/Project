package com.braindata.bankmanagement.client;

import java.util.Scanner;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Hdfc;
import com.braindata.bankmanagement.serviceImpl.Sbi;

public class Test {
	
	public static void main(String[] args)
	{
		Rbi bank=new Hdfc();
		
		Scanner sc= new Scanner(System.in);
		
		while(true)
		
		{
		
		System.out.println("Press 1 for createAccount");
		System.out.println("Press 2 for displayAllDetails");
		System.out.println("Press 3 for depositMoney");
		System.out.println("Press 4 for Withdrawal");
		System.out.println("Press 5 for balanceCheck");
		System.out.println("Enter 6 for Exit ");
	//Display proper msg for callng methods.
		
		
	//As per user choice perform bank operation using switch case
		
		
		System.out.println("Enter Your Choice");
	  
		int i=sc.nextInt();
		switch(i)
		{ 
		case 1:
			bank.createAccount();
			break;
		case 2:
			bank.displayAllDetails();
			break;
		case 3:
			bank.depositeMoney();
	
			break;
		case 4:
			bank.withdrawal();
		
			break;
		case 5:
			bank.balanceCheck();
		
			break;
		case 6:	
			System.out.println("Thank you");
			System.exit(0);
			default:
				
		}
	}
	
		
	}
     }




