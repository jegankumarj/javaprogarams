package com.loop;

import java.util.Scanner;



public class FactorialNum {

	public static void main(String[] args) {
		 int i,num;
		 double fact=1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a num to calculate factorial of number ");
		 num=sc.nextInt();
		 for(i=1;i<=num;i++) {
			 fact=fact*i;
			 
		 }
		 System.out.println("Factorial of "+num+" is "+fact);

	}

}
