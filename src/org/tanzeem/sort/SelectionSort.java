package org.tanzeem.sort;

import java.util.Arrays;

// SELECT the minimum and put that at the right spot.
public class SelectionSort {

	public static void main(String[] args) {

		int[] data = { 20, 15, 12, 5, 2, -18 };
		int i, j;
		int minIndex;
		for (i = 0; i < data.length - 1; i++) { // b'coz j goes 1 step ahead of i always
			minIndex = i;
			for (j = i + 1; j < data.length; j++) {
				if (data[j] < data[minIndex]) {
					minIndex = j;
				}
			}
			int temp = data[minIndex];
			data[minIndex] = data[i];
			data[i] = temp;
		}
		System.out.println(Arrays.toString(data));
	}
}
