package org.tanzeem.sort;

import java.util.Arrays;

// Compare it with adjacent and keep moving
public class InsertionSort {

	public static void main(String[] args) {

		int[] data = { 20, 15, 12, 5, 2, -18 };
		int i, j;
		for (i = 1; i < data.length; i++) {
			int current = data[i];
			j = i - 1;
			while (j >= 0 && data[j] > current) {
				int temp = data[j + 1];
				data[j + 1] = data[j];
				data[j] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(data));
	}

}
