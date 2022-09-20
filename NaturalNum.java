package com.loop;

public class NaturalNum {

	public static void main(String[] args) {
		int i,s=0;
		i=1;
		while(i<=100) {
			s=s+i;
			i=i+1;
		}
       System.out.println("total num of 1 to 100 natural nums "+s);
	}
}
