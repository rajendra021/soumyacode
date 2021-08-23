package com.san.main;

import java.util.Scanner;

public class ConvertFromDigitToInteger {
	public String conversion(int input) {
		String str="";
		String[] units= {"","one","two","three","four"," five","six","seven","eight","nine","ten",
				"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen"
				,"nineteen"};
		String[] tens= {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
		
		if(input<20) {
			str=units[input];
		}
		else if(input>=20 && input<100) {
			str=tens[input/10]+units[input%10];
		}
		return str;
	}
	

	public static void main(String[] args) {
		// create scanner object
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the digit(<100):::");
        int input=scn.nextInt();
        ConvertFromDigitToInteger obj=new ConvertFromDigitToInteger();
        System.out.println(obj.conversion(input));
	}

}
