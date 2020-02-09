package co.edureka;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {78,96,45,25,13,100,72,46,1};
		
		System.out.println("Original Array : "+ Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("Sorted Array:");
		for(int x : arr) {
			System.out.print(x+"  ");
		}//for		
	}
	
	static void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					/*swap elements*/
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
