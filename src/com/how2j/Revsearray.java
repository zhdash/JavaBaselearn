package com.how2j;

public class Revsearray {

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
		
		
		int i=0;
		int j=a.length-1;
		int tmp;
		while(i<j) {
			tmp = a[j];
			a[j]=a[i];
			a[i]=tmp;
			
			i++;
			j--;
		}
		
		System.out.println("翻转后的数组是：");
		for(int k=0; k<a.length;k++) {
			System.out.println(a[k]);
		}
		
		
	}
}
