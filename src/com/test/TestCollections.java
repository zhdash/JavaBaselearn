package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> lists = new ArrayList<Integer>();
		for(int i=0; i<10;i++) {
			lists.add(i);
		}
		int count =0;
		for(int i =0; i<1e6;i++) {
			Collections.shuffle(lists);
			if(lists.get(0)==3&&lists.get(1)==1&&lists.get(2)==4) {
				count++;
				//System.out.println(lists);
			}
			
		}
		double rate = count/(1000d*1000);
		System.out.println("shuffle list 1000,000 次找到前三位为314的概率是："+rate*100+"%");
		
		
		Comparator<Integer> c = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1,Integer o2) {
				return o2-o1;
			}
		};
		Set<Integer>treeSet = new TreeSet<>(c);
		for(int i=0;i<10;i++) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
	
	
	}
		
		
		
		
}

