package com.san.main;

import java.util.Scanner;

public class ReverseAString {
	public void reverseString(String str) {
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			char chs=str.charAt(i);
			String reverse=""+chs;
			System.out.println(reverse);
		}
		
	}

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String input=scn.next();
		ReverseAString obj=new ReverseAString();
         obj.reverseString(input);
	}

}
