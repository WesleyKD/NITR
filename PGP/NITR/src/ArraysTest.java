
public class ArraysTest {

	public static void main(String[] args) {
		/*Array Initialization*/
		int[] marks = {92,87,64,97,85,69};
		System.out.println("No of Subjects = "+ marks.length);
		
		/*--- Array Iteration ---*/
		for(int i=0;i<marks.length;i++) {
			System.out.println("Marks of Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		System.out.println("Marks Obtained::");
		/*--- Array Iteration using enhanced for loop ---*/
		for(int mark : marks) {
			System.out.print(mark+" | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
