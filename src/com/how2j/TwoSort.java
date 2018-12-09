package com.how2j;

public class TwoSort {

	public static void main(String[] args) {
		int a[] ={13,15,37,89,60,39,12,109,56,72};
		int i;
		int j;
		int tmp;
		
		System.out.println("排序前：");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]+" ");
		}
		
		
		//洗澡排序，小到大
		for(i =0;i<a.length;i++) {
			int min =a[i];
			for(j=i+1;j<a.length;j++) {
				if(min>a[j]) {
					tmp = min;
					min = a[j];
					a[j] = tmp;
				}
			}
			a[i]=min;
		}
		System.out.println("选择排序后：");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		
		
		//冒泡排序，大到小
		
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		System.out.println("冒泡排序后：");
		for(i=0;i<a.length;i++) {
			System.out.println(+a[i]+" ");
		}
		
		
		
	}
}
