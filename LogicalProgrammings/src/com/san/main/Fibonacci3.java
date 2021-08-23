package com.san.main;

public class Fibonacci3 {
   static int fib(int n) {
	   if(n<=1)
	   return n;
	   else
		  // System.out.println(fib(n));
	   return fib(n-1)+fib(n-2);
   }
	public static void main(String[] args) {
     int num=3;		
    // System.out.println(fib(n));
     for(int i=0;i<=num;i++) {
    	 System.out.println(fib(i));
     }
	}

}
