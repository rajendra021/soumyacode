package com.san.test;

import com.san.main.Impl;
import com.san.main.Man;

public class LambdaExTelusko {

	public static void main(String[] args) {
		//anonymous inner class 
		/*
		 * Man obj=new Impl() { public void work(String name) {
		 * System.out.println(name+"is studying");
		 * 
		 * } };
		 */
		//lambda expression usage
	//	Man obj=(String name) -> System.out.println(name+"is studying");
		//Man obj=( name) -> System.out.println(name+"is studying");
		Man obj=name -> System.out.println(name+"is studying");
        obj.work("sanu ");
	}

}
