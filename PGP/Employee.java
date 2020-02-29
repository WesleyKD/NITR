class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		empno = 102;
		name = "Sachin";
		sal = 2500.5f;
	}

	void getDetails(){
	  System.out.println(empno+" | "+ name+" | "+sal);
	}

	public static void main(String[] args) 
	{
		/* create an object of type Employee*/
		Employee emp = new Employee();

		/*access the state of object*/
		System.out.println(emp.empno+" | "+ emp.name+" | "+emp.sal);// 0 | null | 0.0

		/* change the state of object with reference*/
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 123.45f;

		emp.getDetails();

		/* change the state of Object with method*/
		emp.setDetails();
		emp.getDetails();

		System.out.println(emp); //calls toString()
		System.out.println(0X6aceb1a5);
		System.out.println(emp.hashCode());
	}
}
