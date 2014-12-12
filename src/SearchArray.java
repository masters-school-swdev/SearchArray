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
		
		int maxSize = 20;
		int maxNumber = 10; // must be less than maxSize
		if (maxNumber > maxSize) {
			System.err.println("maxNumber must be less than or equal to maxSize");
			System.exit(1);
		}
		SearchArray sa = new SearchArray(maxSize);
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i=1; i<= maxNumber; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		for (int val : list) {
			sa.insert(val);
		}

		sa.display();
	}

}
