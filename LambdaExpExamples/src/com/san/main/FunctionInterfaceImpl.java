package com.san.main;

public class FunctionInterfaceImpl {
	public static void main(String[] args) {
		FunctionInterface fi=(x) ->System.out.println("Good morning!!"+x);
		fi.abstractFunction("soumya");
	}

}
