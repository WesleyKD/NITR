package co.edureka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Case1 {
	 
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		getData(list);
		System.out.println(list);
		
		int sum = sumOfEvens1(list);
		System.out.println("Sum of Even Index Elements = "+ sum);		
		
		sum = sumOfEvens2(list);		
		System.out.println("Sum of Even Index Elements = "+ sum);
	}
	
	static void getData(List<Integer> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many elements: ");
		int no = sc.nextInt();
		for(int i=1;i<=no;i++) {
			System.out.print("enter an element: ");
			list.add(sc.nextInt());
		}
	}
	
	static int sumOfEvens1(List<Integer> list) {
		int sum = 0;
		for(int i=0;i<list.size();i+=2) {
			sum+=list.get(i);
		}
		return sum;
	}
	
	static int sumOfEvens2(List<Integer> list) {
		int i=0;
		int sum = 0;
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int ele = it.next();
			
			if(i%2==0) {
			 sum=sum+ele;			 
			}
			i++;
		}		
		return sum;
	}
}
