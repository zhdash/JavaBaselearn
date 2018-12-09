package com.how2j;

public class Hello {

	public static void main(String[] args) {
		byte b = 1; 
		short s = 200;
		int i = 300;
		long l = 400;
		
		//byte 范围是-128--127，
//		byte b2 = 200;
		
		char c = '中';
		//char 中只能存放一个字符，超了就报错 
//		char c2 = 'jj';
//		char c3 = '中国'；
		float f = 54.222f;
		double d =34.222;
		//float后面必须带f,否则会报错
		//float f2 = 54.99;
		
		boolean b1 = true;
		boolean b2 = false;

        // 虽然布尔型真正存放的数据是0(false) 1(true)
        // 但是，不能直接使用0 1 进行赋值
//		boolean b3 = 1;
//		boolean b4 = 0;
		
		//String不是基本类型，
		String str = "hello java";
		
		//类型转换
		char c4 = 'A';
		short s2 = 80;
		c4 = (char) s2;
		//s2 = c4;
		System.out.println(c4);
		
	}
}
