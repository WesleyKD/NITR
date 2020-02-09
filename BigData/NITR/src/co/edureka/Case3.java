package co.edureka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Pair{
	int first, second;
	Pair(int first, int second){
		this.first = first;
		this.second = second;
	}
}

public class Case3 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many numbers: ");
		int no = sc.nextInt();
		
		/*create an int[] to store data*/
		int[] marks = new int[no];
		
		/*data entry*/
		for(int i=0;i<no;i++) {
			System.out.print("enter mark-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(marks));
		
		pairLogic(marks);
		sc.close();
	}//main
	
	static void pairLogic(int[] marks) {
		HashMap<Integer,Pair> packets = new HashMap<>();
		for(int i=0;i<marks.length-1;i++) {
			for(int j=i+1;j<marks.length;j++) {
				Pair p = new Pair(marks[i],marks[j]);
				int prod = marks[i]*marks[j];
				/*
				Object o = packets.put(prod,p);
				if(o!=null) {
				 Pair temp =(Pair)o;	
				 System.out.println("("+temp.first+", "+temp.second+") - "+prod+" - ("+marks[i]+", "+marks[j]+")");
				}
				*/
				
				if(!packets.containsKey(prod)) {
					packets.put(prod, new Pair(marks[i],marks[j]));
				}
				else {
					/*get previous pair*/
					Pair previous = packets.get(prod);
					System.out.println("("+marks[i]+","+marks[j]+") <--> "+"("+previous.first+","+previous.second+")");
					return;
				}//else
			}//for
		}//for
		System.out.println("NO PAIRS FOUND!");
	}//method
}
