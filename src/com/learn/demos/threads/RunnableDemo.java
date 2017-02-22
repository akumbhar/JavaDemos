package com.learn.demos.threads;

public class RunnableDemo {

	public static void main(String[] args) {

		System.out.println("Start of main()");
		MyRunnable runner = new MyRunnable("Counter-A");
		int count = 0;

		do {

			count = runner.getCount();
			System.out.println("Counter value caught by main :: " + count);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (count < 5);

		System.out.println("Exit of main()");
	}

}

class MyRunnable implements Runnable {

	private Thread worker;
	private int count = 0;

	public MyRunnable(String name) {

		worker = new Thread(this, name);
		System.out.println("Starting excuting thread :: " + worker);
		worker.start();

	}

	@Override
	public void run() {

		do {

			System.out.println("Executing thread :: " + worker.getName() + " with value :: " + count);
			count++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (count < 5);

	}

	public int getCount() {
		return count;
	}

}