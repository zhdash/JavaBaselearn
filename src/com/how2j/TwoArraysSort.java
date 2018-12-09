package com.how2j;

import java.util.Arrays;

public class TwoArraysSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[5][8];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(int)(Math.random()*100);
			}
		}
		System.out.println("二维数组的内容：");
		for(int[]i: a) {
			System.out.println(Arrays.toString(i));
		}
		//二维数组复制到一维数组中
		int b[]= new int[a.length* a[0].length];
		for(int i =0; i<a.length; i++) {
			System.arraycopy(a[i], 0, b, i * a[i].length, a[i].length);
						
		}
		Arrays.sort(b);
		for(int i=0;i<a.length;i++) {
			System.arraycopy(b,a[i].length*i,a[i],0,a[i].length);
			
		}
		System.out.println("打印排序后的二维数组：");
		for(int[] i:a) {
			System.out.println(Arrays.toString(i));
		}
		
		
		
		
		
	}

}
