
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[7];
		marks[0] = 94;
		marks[1] = 67;
		System.out.println("Size of Array = "+ marks.length);
		
		for(int x : marks) {
			System.out.print(x+" | ");
		}
		System.out.println();
		
		/*--- creating a String[] --- */
		String names[] = new String[10];
		for(String name : names) {
			System.out.print(name+"  ");
		}
		System.out.println();
		
		/*--- creating a boolean[] ---- */
		boolean[] status = new boolean[6];
		for(boolean s : status) {
			System.out.print(s+"  ");
		}
	}
}
