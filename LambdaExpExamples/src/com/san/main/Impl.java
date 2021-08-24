package com.san.main;

import java.util.Scanner;

public class Impl{

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the person1 name::");
		String s1name=scn.nextLine();
		
		Man obj=(name) -> {

			
			
				System.out.println(name+" is a java deveoper"); 
			
			
		};
	
	obj.work(s1name);
	}
}
