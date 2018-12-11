package com.how2j;
//判断质数
public class Primenum {

	public static void main(String[] args) {
		
		int max = 10000*1000;
		int count = 0;
		for(int i=1;i<max;i++){
			if(isPrime(i))
				count++;
		}
		System.out.println("一千万中共有"+count+"个质数");
		
		
		
		
		
		
	}
	public static boolean isPrime(int i) {
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(0==i%j)
				return false;
		}
		return true;
	}
}
