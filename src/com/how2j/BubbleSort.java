package com.how2j;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] ={13,15,37,89,60,39,12,109,56,72};
		int i;
		int j;
		int tmp;
		
		for(i=0;i<a.length;i++) {
			System.out.println("排序前："+a[i]);
			
		}
		System.out.println(" ");
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
			
		}
		for(i=0;i<a.length;i++) {
			System.out.println("排序后："+a[i]+" ");
		}
	}
	
}
