package org.tanzeem.sort;

import java.util.Arrays;


// keep swapping adjacent until biggest element is BUBBLED to right most position
public class BubbleSort {

	public static void main(String[] args) {

		int[] data = { 20, 15, 12, 5, 2, -18 };
		int count = 0;
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				count++;
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
		System.out.println(count);
	}

}
