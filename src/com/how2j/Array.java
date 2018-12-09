package com.how2j;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		//复制数组
		int a[] = { 18, 62, 68, 82, 65, 9 };
		int b[] =Arrays.copyOfRange(a, 0, 3);
		
		for(int each : b) {
			System.out.println(each);
		}
		
		//转换字符串
		int c[]={ 18, 62, 68, 82, 65, 9 };
		String content = Arrays.toString(c);
		System.out.println(content);
		
		//自带的排序函数
		System.out.println("排序前");
		System.out.println(Arrays.toString(a));
		System.out.println("排序后：");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("数字68出现的位置："+Arrays.binarySearch(a, 68));
		
		
	}
}
