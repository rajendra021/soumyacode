package com.san.main;

import java.util.Scanner;

public class BinaryToDecimalAndViceVersa {
	static void btoD(String binary) {
		System.out.println(Integer.parseInt(binary, 2));
	}
    static void dtoB(String dec) {
    	System.out.println(Integer.parseInt(dec, 8));
    }
	public static void main(String[] args) {
		btoD("111");
		dtoB("111");

	}

}
