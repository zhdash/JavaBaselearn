package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.test.Hero;
//引用容器中的对象方法

public class TestLamdba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		List<Hero> heros = new ArrayList<Hero>();
		
		for(int i=0; i<10;i++) {
			heros.add(new Hero("hero" +i, r.nextInt(100), r.nextInt(100)));
		}
		System.out.println("初始化后的集合");
		System.out.println(heros);
		
		Comparator<Hero> c =(h1,h2)-> h1.compareHero(h2);
		Collections.sort(heros,c);
		Collections.sort(heros, Hero::compareHero);
		System.out.println(heros);
		
		
		
		
	}

}
