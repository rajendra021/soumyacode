package com.san.main;

import java.util.Scanner;

public class SwappingBetwn2nos {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter first no. ");
		int x=scn.nextInt();
		System.out.println("enter second no. ");
		int y=scn.nextInt();
		System.out.println("before swapping two nos are...."+x+" and "+y);
		//swapping
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping two nos are...."+x+" and "+y);
	}

}
