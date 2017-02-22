package com.learn.demos.threads;

public class ExtendsThreadDemo {

	public static void main(String[] args) {

		new MyThread("Thread-1");
		new MyThread("Thread-2");

	}

}

class MyThread extends Thread {

	private int count;

	public MyThread(String threadName) {

		count = 0;
		setName(threadName);
		System.out.println("Starting : " + this);
		start();
	}

	@Override
	public void run() {

		try {
			do {

				System.out.println("Current thread : " + getName() + " :getting value : " + (count++));
				Thread.sleep(500);

			} while (count < 5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}