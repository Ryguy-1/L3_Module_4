// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 
package threads;

import java.util.Random;

public class BruteForceCracker {
	static long code = (long) (new Random().nextDouble() * 1_000_000_000);

	static long startTime;
	static long endTime;
	static float elapsedTime;

	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		long threadNumber = 4;
		long multiple = code/threadNumber;
		Thread t1 = new Thread(()->{
			for (int i = 0; 0 < multiple; i++) {
				while(!checkCode(i));
			}
			
		});
		Thread t2 = new Thread(()->{
			for (long i = multiple; i < multiple*2; i++) {
				while(!checkCode(i));
			}
			
		});
		Thread t3 = new Thread(()->{
			for (long i = multiple*2; i < multiple*3; i++) {
				while(!checkCode(i));
			
			}
		});
		Thread t4 = new Thread(()->{
			for (long i = multiple*3; i < multiple*4; i++) {
				while(!checkCode(i));
			}
			
		});
		
		startTime = System.currentTimeMillis();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		endTime = System.currentTimeMillis();
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}

	public static boolean checkCode(long p) {
		if (p == code) {
			return true;
		} else {
			return false;
		}
	}
}
