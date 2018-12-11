package com.how2j;

public class Packbox {

	public static void main(String[] args) {
		byte b =1;
		short s = 2;
		float f = 3.14f;
		double d = 6.18;
		
		//自动装箱
		Byte b1 =b;
		Short s1 = s;
		Float f1 = f;
		Double d1 = d;
		
		//自动拆箱
		b =b1;
		s = s1;
		f = f1;
		d = d1;
		
		//byte and Integer
//		Integer i1 = b;
//		b = new Integer(1);
		System.out.println(Byte.MAX_VALUE);
		
	}
}
