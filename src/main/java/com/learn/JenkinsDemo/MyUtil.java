package com.learn.JenkinsDemo;

public class MyUtil {

	public static boolean isPrime(int n) {

		if (n < 2)
			return false;

		else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		}
	}

}
