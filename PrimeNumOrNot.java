package com.loop;

import java.util.Scanner;

public class PrimeNumOrNot {

	public static void main(String[] args) {
		 int num,fc=0;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter A num");
		 num=sc.nextInt();
		 for(int i=1;i<=num;i++) {
			 if(num%i==0) {
				fc++;
			 }
		 }
			 if(fc==2) {
				 System.out.println("Prime Num " +fc);
			 }
			 else {
				 System.out.println("Not a Prime Num "+fc);
			 }
		 }

	}


