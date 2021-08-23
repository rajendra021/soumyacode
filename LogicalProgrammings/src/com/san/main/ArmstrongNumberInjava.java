package com.san.main;

import java.util.Scanner;
 
 class ArmstrongNumberInjava{
    static int s;
    static  int sum;
    public static void checkNum(int num){
     int temp=num;
      // int s=0;
      // int sum=0;
     while(num>0){
         s=num%10;
        num=num/10;
        sum= sum+s*s*s;
     }
     if(sum==temp){
         System.out.println( "  is an armstrong no");
     }
     else{
        System.out.println("  is not an armstrong no");
     }

    } 

    public static void main(String [] args){

       // Scanner scn=new Scanner(System.in);
      //  System.out.println("Enter a no to check armstrong or not: ");
       // int num=scn.nextInt();
        checkNum(371);
    }
   
}