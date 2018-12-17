package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>();
		for(int i= 0;i<10;i++) {
			numbers.add(i);
		}
		
		System.out.println("集合中的数据");
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		
		System.out.println("翻转后集合中的数据：");
		System.out.println(numbers);
		
		//混淆后的数据
		Collections.shuffle(numbers);
		System.out.println("混淆后的数据");
		System.out.println(numbers);
		
		//排序后集合的数据：
		Collections.sort(numbers);
		System.out.println("排序后的内容:");
		System.out.println(numbers);
		
		//交换下标的数据，
		System.out.println("交换后下标后的内容：");
		Collections.swap(numbers, 0, 6);
		System.out.println(numbers);
		
		//整体数据的右滚动
		System.out.println("向右滚动4单位，后的内容：");
		Collections.rotate(numbers, 4);
		System.out.println(numbers);
		
		//线程安全简单内容
		System.out.println("把非线程安全的List转换成线程安全的List");
		List<Integer> synchronizednumbers = (List<Integer>)Collections.synchronizedList(numbers);
		
		
	}

}
