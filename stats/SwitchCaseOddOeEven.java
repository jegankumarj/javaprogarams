package com.bran.stats;

import java.util.Scanner;

public class SwitchCaseOddOeEven {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num");
		num=sc.nextInt();
		switch(num%2){
		    case 0 : System.out.println( num+ "Even num");
		             break;
		    case 1 :System.out.println( num+ "Odd num");
		             break;
		             
			
		}
	}

}
