import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SearchArray {

	
	private int[] arr;
	
	private int nElems; // last index
	
	
	public SearchArray(int maxSize) {
		arr = new int[maxSize];
		nElems = -1;
	}
	
	public void insert(int val) {
		arr[++nElems] = val;
	}
	
	public void display() {
		for (int i = 0; i <= nElems; i++) { // including last index
			System.out.print(arr[i] + " ");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SearchArray sa = new SearchArray(10);
		
		sa.insert(77);
		sa.insert(31);
		sa.insert(56);
		sa.insert(23);
		sa.insert(14);
		sa.insert(5);
		sa.insert(99);
		
		sa.display();
		
		System.out.println();
		
	}

}
