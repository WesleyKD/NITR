import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		findSum();
	}
	
	static void findSum() 
	{		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int x = sc.nextInt();
		
		System.out.print("enter second number: ");
		int y = sc.nextInt();
		
		int sum = x+y;
		System.out.println("Sum = "+ sum);	
		System.out.println(x+" + "+y+" = "+sum);
	}
}
