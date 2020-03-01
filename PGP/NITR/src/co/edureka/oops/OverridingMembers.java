package co.edureka.oops;

class A{
	int a=10,b=20;
	void display() {
		System.out.println("Inside class A");
	}
}
class B extends A{
	int a=30, b=40;
	@Override //annotation
	void display() {
		System.out.println("Inside class B");
		System.out.println(a+" | "+this.b+" | "+super.a+" | "+super.b);
		super.display();
	}
}

public class OverridingMembers {
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.a+" | "+obj.b); //30 | 40
		obj.display();
		System.out.println(obj instanceof B); //true
		System.out.println(obj instanceof A); //true
		System.out.println(obj instanceof java.lang.Object); //true
	}
}
