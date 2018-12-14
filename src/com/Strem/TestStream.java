package com.Strem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStream {

	
	public static void main(String[] args) {
		//字节流方式读取文件中的内容，
		try {
			File f = new File("e:/lol.txt");
			FileInputStream fis =new FileInputStream(f);
			
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for(byte b: all) {
				System.out.println(b);
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}
		
		//字节流写入人内容
		try {
		
			File f1 = new File("e:/lol1.txt");
			byte[] data = {88,89};
			FileOutputStream fos = new FileOutputStream(f1);
			fos.write(data);
			fos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//在某个路径在以字节流写入文件，先判断路径是否存在，不存在就创建，然后继续
		try {
			File f2 =new File("e:/xyz/abc/lol3.txt");
			File dir = f2.getParentFile();
			if(!dir.exists()) {
				dir.mkdir();
				dir.mkdirs();
				
			}
			byte data1 []= {88,89};
			FileOutputStream fos1 = new FileOutputStream(f2);
			fos1.write(data1);
			fos1.close();
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//使用字符流读取文件
		File f3 = new File("e:/lol.txt");
		// 创建基于文件的Reader
		try (FileReader fr = new FileReader(f3)){
			char[] all1 = new char[(int)f3.length()];
			fr.read(all1);
			for(char b:all1) {
				System.out.println(b);
			}
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//使用字符流把字符串写入到文件
		File f4 = new File("e:/lol2.txt");
		try (FileWriter fr = new FileWriter(f4)){
			
			String data = "hdajhkhkdhdjh";
			char[] cs = data.toCharArray();
			fr.write(cs);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
}
