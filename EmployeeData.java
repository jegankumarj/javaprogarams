package com.yamaha.data;

import java.util.Scanner;

public class EmployeeData {

	public static void main(String[] args) {
		String ename;
		int eage;
		int ecode;
		float esalary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		ename=sc.nextLine();
		System.out.println("Enter your age");
		eage=sc.nextInt();
		System.out.println("Enter your salary");
		esalary=sc.nextFloat();
		
		System.out.println("Employee Details");
		System.out.println( "name="+ename);
		System.out.println("age="+eage);
		System.out.println("salary="+esalary);
	}
	}
		       
				