package com.how2j;

public class Minarray {

	
	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = (int) (Math.random()*100);
		a[1] = (int) (Math.random()*100);
		a[2] = (int) (Math.random()*100);
		a[3] = (int) (Math.random()*100);
		a[4] = (int) (Math.random()*100);
		
		System.out.println("数组中的各个随机数是：");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int min=0;
		for(int j=1;j<a.length;j++) {
			if(a[min]>a[j]) {
				min=j;
			}
		}
		System.out.println("最小的值是："+a[min]);
	}
}
