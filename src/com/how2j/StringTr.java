package com.how2j;

public class StringTr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i = 6;
		
		String str = String.valueOf(i);
		System.out.println(str);
		Integer it = i;
		String str2 = it.toString();
		System.out.println(str2);
		
		//字符串转化数字
		String str3 = "888";
		int i1 = Integer.parseInt(str3);
		System.out.println(i1);
		
		//
		float f1=3.14f;
		String str4 = String.valueOf(f1);
		System.out.println(str4);
		
		double d1 = Double.parseDouble(str4);
		System.out.println(d1);
		
		
	}

}
