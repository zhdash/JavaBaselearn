package com.Thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 15, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>());
		threadPool.execute(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("任务1");
			}
		});
	}

}
