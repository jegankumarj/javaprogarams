package com.atm;

import java.util.Scanner;

class Bank{
	float amount ;
void depositamount(float depositamount) {
	 amount=amount+depositamount;
	 System.out.println("Balence in the bank After Balence "+amount);
	 
}	 
void withdrawamount(float withdrawamount) {
	if(withdrawamount>amount) {
		System.out.println("Insufficient balence!!!!!!!!");
		System.out.println("Avilable Balence  " +amount);
	}else {
		    amount=amount-withdrawamount;
			System.out.println("After amount withdraw avilalbale balence "+amount);
		}
	}
}

public class BankMain {
	public static void main(String[] args) {
		float damount,wamount;
		int chioce;
		Bank ob1=new Bank();
		while(true) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Menu For My Bank");
		System.out.println("Enter Your Choice");
		System.out.println("1.Deposit Amount");
		System.out.println("2.Withdraw Amount");
		chioce=sc.nextInt();
		switch(chioce) {
		case 1 : System.out.println("Enter the Deposit Amount");
		         damount=sc.nextFloat();
		         ob1.depositamount(damount);
		         break;
		case 2 : System.out.println("Enter the Amount you Want to withdraw");
		         wamount=sc.nextFloat();
		         ob1.withdrawamount(wamount);
		         break;
		 default : System.out.println("Inavalid input");	
	}
		System.out.println("Do you want to Continue");
		char option = sc.next().charAt(0);
		if(option=='y') {
			continue;
		}
		else {
			break;
		}
	}
		System.out.println("Exit");
}
}