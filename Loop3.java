package com.loop;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		      int n;
		      Scanner sc=new Scanner(System.in);
		      System.out.println("print factors");
		      System.out.println("Enter a Num");
		      n=sc.nextInt();
		      for(int i=1;i<=n;i++) {
		    	  if(n%i==0) {
		    		  System.out.println(i);
		    	  }
		      }
				
			}
	}


