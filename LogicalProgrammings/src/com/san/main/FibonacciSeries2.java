package com.san.main;

public class FibonacciSeries2 {

	public static void main(String[] args) {
		int s=0;int e=1;int n=15;int i=0;
		while(i<=n) {
			int sum=s+e;
			s=e;
			e=sum;
			i++;
			System.out.println("sum of series are....."+sum);
		}

	}

}
