package com.loop.java;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
            // for(i=1;i<=10;i++); //Creating Delay
            	// System.out.println(i);
		int i ;
		Scanner sc=new Scanner(System.in);
		/*for(i=1;i<=10;i++); //creating delay
		System.out.println(i); //11
		
		//infinite for loop
		for(;;) {
			System.out.println("hello");
			System.out.println("Loop will not terminate, user should terminate");
			System.out.println("Do you want while loop to continue (y/n)");
			char ch=sc.next().charAt(0);
			if(ch=='n') {
				break; //breaks the loop
			}
			
		}
		System.out.println("Program Will be Terminated");
		
		//infinite while loop
	*/
		while(true) {
			System.out.println("Inside while loop");
			System.out.println("Do you want while loop to continue (y/n)");
			char ch=sc.next().charAt(0);
			if(ch=='n') {
				break; //breaks the loop
			}
		}
		System.out.println("Program will be Stop");

                    
	}

}
