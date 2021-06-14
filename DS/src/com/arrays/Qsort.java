package com.arrays;

public class Qsort {
	public static void main(String[] args) {
		int a[] = { 3, 5, 2, 13, 12, 3, 2, 13, 45 };
		int n = a.length;
		Qsort q = new Qsort();
		q.printArray(a, n);
		q.quickSort(a, 0, n - 1);
		q.printArray(a, n);
	}

	public void printArray(int[] a, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + ", ");
		System.out.println();
	}

	public void quickSort(int[] a, int low, int high) {
		// index of pivot after partition
		if (low < high) {
			int partitionIndex = partition(a, low, high);
			quickSort(a, low, partitionIndex - 1);// sort left subarray
			quickSort(a, partitionIndex + 1, high);// sort right subarray
		}
	}

	public int partition(int[] a, int low, int high) {
		// TODO Auto-generated method stub
		System.out.println("Inside partition "+low+"high: "+high);
		
		int temp = 0;
		int pivot = a[low];
		int i = low + 1;
		int j = high;
		while (i < j) {
			while (a[i] <= pivot) {
				i++;
			}

			while (a[j] > pivot) {
				j--;
			}

			if (i < j) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		} 
		temp = a[low];
		a[low] = a[j];
		a[j] = temp;

		return j;
	}
}
