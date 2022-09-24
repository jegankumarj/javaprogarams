package com.assgn.pract;

public class OperatorsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment Operator
		int number1, number2;
		 number1 = 10;
		 System.out.println(number1);
		 number2 = number1;
		 System.out.println(number2);

		// Arithmetic Operator
		 double output;

		 // Addition operator
		 output = number1 + number2;
		 System.out.println("number1 + number2 = " + output);

		 // Subtraction operator
		 output = number1 - number2;
		 System.out.println("number1 - number2 = " + output);

		 // Multiplication operator
		 output = number1 * number2;
		 System.out.println("number1 * number2 = " + output);
		 // Division operator
		 output = number1 / number2;
		 System.out.println("number1 / number2 = " + output);

		 // Remainder operator
		 output = number1 % number2;
		 System.out.println("number1 % number2 = " + output);

		// Unary Operators
		 double number = 10, resultNumber;
		 boolean flag = false;

		 System.out.println("+number = " + +number);
		 // number is equal to 10.

		 System.out.println("-number = " + -number);
		 // number is equal to 10.

		 // ++number is equivalent to number = number + 1
		 System.out.println("number = " + ++number);
		 // number is equal to 11.
		 // -- number is equivalent to number = number - 1
		 System.out.println("number = " + --number);
		 // number is equal to 10.
		 System.out.println("!flag = " + !flag);
		 // flag is still false.
		 System.out.println(number++);
		 System.out.println(number);
		 System.out.println(++number);
		 System.out.println(number);

		// Relational Operators
		 if (number1 > number2)
		 {
		 System.out.println("number1 is greater than number2.");
		 }
		 if (number1 < number2)
		 {
		 System.out.println("number2 is greater than number1.");
		 }
		 if (number1 == number2)
		 {
		 System.out.println("number1 is equal to number2.");
		 }

		// Logical Operators
		 int number3 = 20;
		 boolean result;
		 // Logical OR Operator
		 result = (number1 > number2) || (number3 > number1);
		 // result will be true because number3 greater than number1
		 System.out.println(result);

		 // Logical AND Operator
		 result = (number1 > number2) && (number3 > number1);
		 // result will be false because number1 is equal to number2
		 System.out.println(result);
		 System.out.println("number = " + ++number);
		 // number is equal to 11.
		 // -- number is equivalent to number = number - 1
		 System.out.println("number = " + --number);
		 // number is equal to 10.
		 System.out.println("!flag = " + !flag);
		 // flag is still false.
		 System.out.println(number++);
		 System.out.println(number);
		 System.out.println(++number);
		 System.out.println(number);

		// Relational Operators
		 if (number1 > number2)
		 {
		 System.out.println("number1 is greater than number2.");
		 }
		 if (number1 < number2)
		 {
		 System.out.println("number2 is greater than number1.");
		 }
		 if (number1 == number2)
		 {
		 System.out.println("number1 is equal to number2.");
		 }

		// Logical Operators
		 int number4 = 20;
		 boolean results;
		 // Logical OR Operator
		 result = (number1 > number2) || (number4 > number1);
		 // result will be true because number3 greater than number1
		 System.out.println(result);

		 // Logical AND Operator
		 result = (number1 > number2) && (number4 > number1);
		 // result will be false because number1 is equal to number2
		 System.out.println(result);

	}

}
