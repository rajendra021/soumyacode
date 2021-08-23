package com.san.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class RegExString {

	public static void main(String[] args) {
		System.out.println(valCheck());
		
	}

		 public static List<String> valCheck(){

		List<String> al = new ArrayList<>();
		al.add("x2333");
		al.add("x2333");
		al.add("y3456");
		al.add("x4993");
		al.add("x2245");
		al.add("z2467");
		// System.out.println(al);

		List<String> al2 = new ArrayList<>();
		
		//using for-each method
		al.forEach(value ->{
			
			if(value.matches("[x0-9]{5}"))
				//System.out.println(value);
			
			al2.add(value);
		});

		return al2;
		 }
		
		/*
		 * for (String val : al) { if (val.matches("[x0-9]{5}")) { //
		 * System.out.println(val); al2.add(val); } }
		 */
	}


