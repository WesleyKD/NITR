package co.edureka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Case4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Managers: ");
		int nm = sc.nextInt();
		System.out.print("Enter No of Subordinates: ");
		int ns = sc.nextInt();
		
		Manager[] managers = new Manager[nm];
		
		System.out.println("<<< Managers Entry");
		for(int i=0;i<nm;i++) {
			System.out.println("Name of Manager-"+(i+1)+": ");
			String mname = sc.next();
			Manager manager = new Manager(mname,new ArrayList<Subordinate>());
			managers[i] = manager;
		}
		System.out.println();
		System.out.println("<<< Suborinates Entry");
		for(int i=0;i<ns;i++) {
			System.out.println("enter manager name, employee name, int:");
			String mname = sc.next();
			String ename = sc.next();
			int age = sc.nextInt();
			Subordinate sub_emp = new Subordinate(ename,age);
			
			for(int j=0;j<managers.length;j++) {
				if(managers[j].getName().contentEquals(mname)) {
					managers[j].getSubs().add(sub_emp);
				}
			}			
		}
		
		Arrays.sort(managers);
		for(int i=0;i<managers.length;i++) {
		  System.out.println("----------------------------");	
		  System.out.println("Manager: "+ managers[i]);
		  System.out.println("Suboridnates: ");
		  List<Subordinate> sub_emps = managers[i].getSubs();
		  Collections.sort(sub_emps);
		  int x=1;
		  for(Subordinate sub : sub_emps) {
			  System.out.println(x++ +". "+sub);
		  }
		}
		sc.close();
	}
}

class Subordinate implements Comparable<Subordinate>{
	private String name;
	private int age;
	Subordinate(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Subordinate o) {
	    if(this.age>o.age)
	    	return -1;
	    else if(this.age<o.age)
	    	return 1;
	    else
	    	return 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Subordinate [" + name + " | " + age + "]";
	}
	
}

class Manager implements Comparable<Manager>{
	private String name;
	private ArrayList<Subordinate> subs;
	Manager(String name, ArrayList<Subordinate> subs){
		this.name = name;
		this.subs = subs;
	}
	@Override
	public int compareTo(Manager o) {
		return this.name.compareTo(o.name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Subordinate> getSubs() {
		return subs;
	}
	public void setSubs(ArrayList<Subordinate> subs) {
		this.subs = subs;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
