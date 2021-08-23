package com.san.main;

import java.util.Scanner;

public class FactorialOfANum {
	static int findFactorial(int n) {
		if(n<=1) 
			return 1;
		else
			return n*findFactorial(n-1);
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the num::");
		int n=scn.nextInt();
	  System.out.println(findFactorial(n));
		/*
		 * for(int i=0;i<=n;i++) { System.out.println(findFactorial(i)); }
		 */
	}

}
