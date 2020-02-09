package co.edureka;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Courses {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		HashSet<String> courses = new HashSet<String>();
		
		String req="Y";
		while(req.equalsIgnoreCase("Y")) {
			System.out.print("enter course name: ");
			String cname = sc.nextLine();
			boolean status = courses.add(cname);			
			
			if(!status) {
				System.out.println("\""+cname+"\" is already added to the List");
			}
			System.out.print("More course to add [Y/N]: ");
			req=sc.nextLine();
		}
		
		System.out.println(courses);
		
		/*iteration of courses*/
		System.out.println("Courses @ Edureka:");
		int i=1;
		Iterator<String> it = courses.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(i++ + ". "+ name);
			Thread.sleep(2000); //2000ms
		}
		sc.close();
		
		courses.add(null);
	}
}
