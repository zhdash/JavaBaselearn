package com.how2j;

public class Wei {

	public static void main(String[] args) {
		int i = 4;
		String b = (Integer.toBinaryString(i));
		System.out.println(i+"二进制是:"+b);
		int j =5;
		int k =6;
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(k));
		System.out.println(j|k);
		System.out.println(j&k);
		
		System.out.println(j^k);
		System.out.println(j^0);
		System.out.println(j^1);
		
		byte v =2;
		System.out.println(v<<4);
		System.out.println(v>>1);
		int p =1;
		System.out.println(p+=++p);
	}
}
