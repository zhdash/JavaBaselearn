package com.how2j;

public class StringRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//字符和数字之间转换
		char c = 'C';
		short s = (short)c;
		short s1='B';
		char c1 = 40;
		System.out.println(s1);
		System.out.println(s);
		System.out.println(c1);
		
		char cs[] =new char[5];
		short start = '0';
		short end = 'z'+1;
		for(int i=0;i<cs.length;i++) {
			while(true) {
				char c2 =(char)(Math.random() * (end-start));
				if(Character.isLetter(c2)|| Character.isDigit(c2)) {
					cs[i]= c2;
					break;
				}
			}
		}
		String result = new String(cs);
		System.out.println(result);
		
	}

}
