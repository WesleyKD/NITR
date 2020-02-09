package co.edureka;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {15,25,48,7,63,91,42};
		int key = 25;
		int index = searchElement(arr, key);
		if(index==-1) {
			System.out.println(key+" is NOT in List");
		}
		else {
			System.out.println(key+ " in Index: "+ index);
		}
	}
	/*method to do search operation*/
	static int searchElement(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key)
				return i;
		}//for
		return -1;
	}
}
