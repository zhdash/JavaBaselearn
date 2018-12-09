package com.how2j;

import java.util.Scanner;

/**
 * @author hah
 *
 */
public class Scanner1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("shudeshu :" +a);
		int b = s.nextInt();
		System.out.println("dierge shurude shu :"+b);
		
		Scanner s1 = new Scanner(System.in);
		float f2 = s1.nextFloat();
		System.out.println("输入的负浮点数是："+f2);
		
		
		Scanner s2= new Scanner(System.in);
		String str = s2.nextLine();
		System.out.println("字符串："+str);
		
	}
}
