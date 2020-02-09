package co.edureka;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 25, 61, 74, 76, 86, 89, 92, 93 };
		// Arrays.sort(arr);
		System.out.println("No of Elements in Array = " + arr.length);
		System.out.println("Array Elements = " + Arrays.toString(arr));

		int key = 26;
		int index = binarySearch(arr, key, 0, arr.length - 1);
		if(index == -1)
			System.out.println(key+" is NOT in List");
		else
			System.out.println(key+" in Index : "+ index);
	}

	static int binarySearch(int[] arr, int key, int low, int high) {
		
		while (low <= high) {
			int mid = (low + high) / 2;			
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
			binarySearch(arr, key, low, high);
		}
		return -1;
	}
}
