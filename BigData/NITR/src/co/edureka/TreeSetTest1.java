package co.edureka;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<Integer> marks = new TreeSet<>(new MarksComparator());
		marks.add(78);
		System.out.println("------------");
		marks.add(65);
		System.out.println("------------");
		marks.add(66);
		System.out.println("------------");
		marks.add(55);
		System.out.println("------------");
		marks.add(90);
		System.out.println("------------");
		marks.add(56);
		System.out.println("------------");
		marks.add(80);
		System.out.println("-----------");
		marks.add(79);
		System.out.println("-----------");
		marks.add(77);
		System.out.println(marks);
	}
}

class MarksComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
	    System.out.println(o1 + " - "+ o2);
		return o1.compareTo(o2);
	}
}
