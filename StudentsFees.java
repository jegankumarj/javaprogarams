package com.assgn.pract;
class Student {
	// static variable
	 public static double fees;
	 public static String name = "Sarath";
	}

public class StudentsFees {

	public static void main(String[] args) {
			
			Student.fees = 9999999.99;
			 System.out.println(Student.name + " annual fees : " + Student.fees); 
		

	}

}
