package com.Thread;


import java.io.File;

public class TestThread {

	
	
	static ThreadPool pool = new ThreadPool();
	public static void search(File file,String search) {
		
		if(file.isFile()) {
			if(file.getName().toLowerCase().endsWith(".java")) {
				SearchFileThread task = new SearchFileThread(file, search);
				pool.add(task);
				
			}
		}
		if(file.isDirectory()) {
			File[] fs = file.listFiles();
			for(File f:fs) {
				search(f,search);
			}
		}
		
	}
	public static void main(String[] args) {
		File folder = new File("E:\\java");
		search(folder,"ha");
	}
	
	
}
