package co.edureka;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student{
	  int rno;
	  String name;
	  Student(int rno, String name){
		  this.rno = rno;
		  this.name = name;
	  }
	@Override
	public String toString() {
		return "Student [" + rno + " | " + name + "]";
	}	  
}

public class StudentsList 
{
	public static void main(String[] args) 
	{
	 TreeSet<Student> students = new TreeSet<Student>(new MyComparator());	
	 
	 Student st1 = new Student(104,"Sunil");
	 Student st2 = new Student(102,"Pavan");
	 Student st3 = new Student(101,"Nitin");
	 
	 students.add(st1);
	 students.add(st2);
	 students.add(st3);
	 
	 //System.out.println(students);
	 Iterator<Student> it = students.iterator();
	 while(it.hasNext()) {
		 Student st = it.next();
		 System.out.println(st);
	 }
	}
}


class MyComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.rno == o2.rno)
		   return 0;
		else if(o1.rno > o2.rno)
			return 1;
		else
			return -1;
	}
	
}

