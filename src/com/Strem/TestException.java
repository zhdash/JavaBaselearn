package com.Strem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*File f = new File("E:/LOL.exe");
		
		try {
			System.out.println("尝试打开e:/LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("e:/LOL.exe找不到");
			e.printStackTrace();
		}*/
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<Integer.MAX_VALUE;i++) {
			sb.append('b');
		}
		
	}

}
