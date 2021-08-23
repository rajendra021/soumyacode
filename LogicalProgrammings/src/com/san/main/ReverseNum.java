package com.san.main;

import java.util.Scanner;

public class ReverseNum {
	
	public static void main(String[] args) {
		int reverse=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number::");
		int num=scn.nextInt();
		while(num!=0) {
			int remain=num%10;
			// reverse=reverse*10+remain;
			reverse=reverse*10+remain;
			// num=num/10;
			 num/=10;
		}
		 System.out.println("reverse of the number is:"+reverse);
	}

}
