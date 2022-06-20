package com.ank.wrapperclass;

public class Primitive_to_wrapper {
	public static void main(String args[])
	{
		int a= 20;
		Integer i = Integer.valueOf(a);
		Integer j = a;
		System.out.println(a+" "+i+" "+j);
	}

}
