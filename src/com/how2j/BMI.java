package com.how2j;

import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		
	
		System.out.println("输入你的体重（kg）：");
		Scanner s = new Scanner(System.in);
		float f1 = s.nextFloat();
		
		System.out.println("输入你的身高(m)：");
		Scanner s1 =new Scanner(System.in);
		float f2 = s1.nextFloat();
		
		float bmi;
		
		bmi = f1 /(f2*f2);
		System.out.println("你的BMI是："+bmi);
		if(bmi<18.5) {
			System.out.println("你的体重偏轻。");
			
		}else if(18.5<=bmi&&bmi<24) {
			System.out.println("正常范围。");
		}else if (24<=bmi&&bmi<27) {
			System.out.println("体重过重");
		}else if(27<=bmi&&bmi<30) {
			System.out.println("轻度肥胖");
			
		}else if (30<=bmi&&bmi<35) {
			System.out.println("中毒肥胖");
		}else {
			System.out.println("过度肥胖");
		}
		
	}
	
}
