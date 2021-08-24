package com.san.main;

import java.util.ArrayList;

public class LambdaArraylistEx {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		for(int value:al)
			System.out.println(value);
	//using foreach method
		System.out.println("using for each method:");
	al.forEach(n -> System.out.println(n));
	System.out.println("printing only even values:");
	al.forEach(n -> {if(n%2==0)System.out.println(n);});
	}
}
