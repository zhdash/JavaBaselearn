package com.Thread;
import com.Thread.SearchFileThread;

import java.io.File;

public class TestFile {

	
	public static void search(File file, String search) {
		if(file.isFile()) {
			if(file.getName().toLowerCase().endsWith(".java")) {
				new  SearchFileThread(file, search).start();
			}
			if(file.isDirectory()) {
				File[]fs = file.listFiles();
				for(File f: fs) {
					search(f, search);
				}
			}
		}
	}
	public static void main(String[] args) {
		File folder =new File("e:\\java");
		search(folder,"Magic");
	}
}
