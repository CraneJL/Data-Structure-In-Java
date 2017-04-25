package com.ds.sort;

public class QuickSort {
	public static void quickSort(int[] array) {
		if (array == null || array.length <= 1) {
			return;
		}
		
		quickSort(array, 0, array.length);
	}
	
	private static void quickSort(int[] array, int low, int high) {
		if (high <= low) {
			return;
		}
		int j = partition(array, low, high);
		
		quickSort(array, low, j-1);
		quickSort(array, j+1, high);
	}
	
	private static int partition(int[] array, int low, int high) {
		int i = low;
		int j = high + 1;
		int target = array[low];
		
		while (true) {
			while (array[++i] < target) {
				if (i == high) {
					break;
				}
			}
			while (array[--j] > target) {
				if (j == low) {
					break;
				}
			}
			if (i >= j) {
				break;
			}
			
			swap(array, i, j);
		}
		
		swap(array, low, j);
		
		return j;
	}
	
	private static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

}
