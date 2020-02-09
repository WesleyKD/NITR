package co.edureka;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] array_1 = {10,12,14,16,18,20,22,24};
		int[] array_2 = {11,13,15,17,19};
		//Arrays.sort(array_1);
		
		System.out.println(Arrays.toString(array_1));
		
		int[] array_3 = new int[array_1.length+array_2.length];
		
		mergeArrays(array_1, array_2, array_3);
		
		System.out.println("Merged Array: ");
		for(int x : array_3) {
			System.out.print(x+" | ");
		}
	}
	/*method to merge 2 sorted arrays*/
	static void mergeArrays(int[] arr1, int[] arr2, int[] arr3) {
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
			}
			else {
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		/*to store the rest elements in array*/
		for(;i<arr1.length;i++) {
			arr3[k++] = arr1[i];
		}
		
		for(;j<arr2.length;j++) {
			arr3[k++] = arr2[j];
		}
		
	}
}
