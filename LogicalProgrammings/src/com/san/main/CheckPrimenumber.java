package com.san.main;

public class CheckPrimenumber {
	
	public static void checkNum(int n) {
		
		if (n==0||n==1) {
			System.out.println(n+"  is not prime no");
		}
		
		else {
			int count=0;
			for(int j=2;j<n;j++) {
				
				if(n%j==0) {
					count++;
				}
				
			}
			if(count==0)
				System.out.println(n+" is a prime no.");
			else
				System.out.println(n+" is not a prime no.");
		}
		
	}

	public static void main(String[] args) {
		checkNum(13);

	}

}
