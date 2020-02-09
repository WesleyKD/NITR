package co.edureka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		getData(list);
		System.out.println(list);		

		/*case-1 : Print the 3rd element from the beginning */				
		if(list.size()>3) {
			System.out.println("Element @ index 3 = "+list.get(3));
		}
		else {
			System.out.println("Index 3 not available in the list ");
		}
		
		/*case-2 : Replace the 5th element from the beginning with integer 8 */
		if(list.size()>5) {
			list.set(5,8);
			System.out.println(list);
		}
		
		/*Case-4 : Print the index of the element 56 */
		int index = list.indexOf(56);
		if(index < 0) {
			System.out.println("56 is NOT in list");
		}
		else {
			System.out.println("56 is in index: "+ index);
		}
	}
	
	/*data entry method*/
	static void getData(List<Integer> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many elements: ");
		int no = sc.nextInt();
		for(int i=1;i<=no;i++) {
			System.out.print("enter an element: ");
			list.add(sc.nextInt());
		}
	}	

}
