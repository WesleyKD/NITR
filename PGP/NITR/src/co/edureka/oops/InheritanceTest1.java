package co.edureka.oops;
class Base{
	int a=10,b=20;
	void displayAB() {
		System.out.println("Inside Base class: "+ a+" | "+b);
	}
}

class Derived extends Base{
 	int c=30, d=40;
 	void displayC() {
 		System.out.println("Inside Derived class: "+ a+" | "+b+" | "+c+" | "+d); 		
 	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		Derived obj = new Derived();
		System.out.println(obj.a+" | "+ obj.b+" | "+obj.c+" | "+obj.d);
		obj.displayC();
		obj.displayAB();
	}
}
