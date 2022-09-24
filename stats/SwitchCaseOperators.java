package com.bran.stats;

import java.util.Scanner;

public class SwitchCaseOperators {

	public static void main(String[] args) {
		int ch ;
		float num1,num2,res;
		while(true) {
		System.out.println("**************Operators**************");
		System.out.println("Addition");
		System.out.println("Subtration");
		System.out.println("Muliplication");
		System.out.println("Division");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		System.out.println("Enter 2 nums");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
        switch(ch){
        case 1:res=num1+num2;
        	   System.out.println("Sum of "+num1+" and"+num2+" Is "+res);
               break;
        case 2:res=num1-num2;
 	           System.out.println("Sub of "+num1+" and"+num2+" Is "+res);
               break;    
        case 3:res=num1*num2;
 	           System.out.println("Multiplication of "+num1+" and"+num2+" Is "+res);
                break;
        case 4:if(num2==0) {
        	       System.out.println("Divided by Zero ");
               }
               else {
        	   res=num1/num2;
               System.out.println("Division of "+num1+" and"+num2+" Is "+res);
               break;       
                    }   
              }
          
        	     }
               
        }      
                       
	}


