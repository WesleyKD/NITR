package co.edureka;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {78,96,45,25,13,100,72,46};
		
		System.out.println("Original Array : "+ Arrays.toString(arr));
		
		sort(arr);
		
		System.out.println("Sorted Array:");
		for(int x : arr) {
			System.out.print(x+"  ");
		}//for		
			
  }//main
  static void sort(int[] arr) {
	  for(int i=0;i<arr.length-1;i++) {
		  int min = i;
		  for(int j=i+1;j<arr.length;j++) {
			  if(arr[min]>arr[j])
				  min=j;
		  }//for
		  if(i != min) {
			  /*swap the elements*/
			  int temp = arr[min];
			  arr[min] = arr[i];
			  arr[i] = temp;
		  }
	  }//for
  } //sort	
}
