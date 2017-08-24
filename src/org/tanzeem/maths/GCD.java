package org.tanzeem.maths;

public class GCD {

	public static void main(String[] args) {

		// m, n should be non-zero & m > n
		int m = 14;
		int n = 13;
		System.out.println(calculateGCD(m, n));
	}

	private static int calculateGCD(int m, int n) {
		int r = m % n;
		if (r == 0)
			return n;
		else {
			m = n;
			n = r;
			return calculateGCD(m, n);
		}
	}

}
