package com.how2j;

public class Foreach {

	public static void main(String[] args) {
		int a[]= {18,62,68,82,65,9999};
		//int i,j,tmp;
		int max=-1;
		for(int each: a) {
			System.out.println(each+" ");
		}
		
		for(int each:a) {
			if(each>max)
				max=each;
		}
		System.out.println("最大值是："+max);
	}
}
