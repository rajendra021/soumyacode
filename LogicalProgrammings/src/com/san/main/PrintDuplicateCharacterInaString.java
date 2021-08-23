package com.san.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicateCharacterInaString {
	public void duplicateChars(String str) {
		//creating hashmap
		HashMap<Character,Integer> hm=new HashMap<>();
		char[] chars=str.toCharArray();
		for(char character:chars) {
			if(hm.containsKey(character)) {
				hm.put(character, hm.get(character)+1);
			}
			else {
			    hm.put(character, 1);	
			}
		}
		//traversing the hashmap using advance forloop
		//hm.forEach((key,value) -> System.out.println("key="+key+"value="+value));
		for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+"   "+entry.getValue());
			}
		}
		}

	public static void main(String[] args) {
		
		//create scanner object
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string::");
		String input=scn.next();
		PrintDuplicateCharacterInaString obj=new PrintDuplicateCharacterInaString();
		obj.duplicateChars(input);
	}
}
