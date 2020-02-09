package co.edureka;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> marks = new TreeSet<>();
		marks.add(78);
		marks.add(65);
		marks.add(93);
		marks.add(55);
		marks.add(90);
		System.out.println(marks);
		marks.add(null);
	}
}
