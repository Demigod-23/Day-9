package com.ank.wrapperclass;

public class demo {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0f;
		double d = 60.0d;
		char c = 'a';
		boolean b2 = true;
		Byte byteobj = b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean boolobj= b2;
		System.out.println("--Printing object values---");
		System.out.println("Byte object : "+byteobj);
		System.out.println("Short object : "+shortobj);
		System.out.println("Integer object : "+intobj);
		System.out.println("Long object : "+longobj);
		System.out.println("Double object : "+doubleobj);
		System.out.println("Charatcer object : "+charobj);
		System.out.println("Boolean object : "+boolobj);
		
		byte bytevalue = byteobj;
		short shortvalue = shortobj;
		int intvalue = intobj;
		long longvalue = longobj;
		float floatvalue = floatobj;
		double doublevalue = doubleobj;
		char charvalue = charobj;
		boolean boolvalue = boolobj;
		System.out.println('\n'+"--Printing primitive values---");
		System.out.println("Byte value : "+bytevalue);
		System.out.println("Short value : "+shortvalue);
		System.out.println("Integer value : "+intvalue);
		System.out.println("Long value : "+longvalue);
		System.out.println("Double value : "+doublevalue);
		System.out.println("Charatcer value : "+charvalue);
		System.out.println("Boolean value : "+boolvalue);
	}

}
