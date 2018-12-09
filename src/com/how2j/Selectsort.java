package com.how2j;
//选择排序，选出数组中最小值放到最前面，以此类推，整体就有序了
public class Selectsort {

	public static void main(String[] args) {
		int a [] = new int[]{13,15,37,89,60,39,12,109,56,72};
		System.out.println("排序前：");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println(" ");
		
		for(int i =0;i<a.length;i++) {
			int min =a[i];
			for(int j=i+1;j<a.length;j++) {
				if(min>a[j]) {
					int tmp;
					tmp = min;
					min = a[j];
					a[j] = tmp;
					
					
				}
			}
			a[i]=min;
		}
		System.out.println("排序后：");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
	}
}
