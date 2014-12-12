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
	 * 
	 * @param val
	 * @return index of val or -1 if not found
	 */
	public int find(int val) {
		// linear search -- walk thru array comparing each value
		int indx = -1; // not found
		for (int i = 0; i <= nElems; i++) {
			if (arr[i] == val) {
				indx = i;
				break;
			}
		}
		return indx;
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
		
		// find a value
		System.out.println();
		
		int indx = sa.find(5);
		
		if (indx == -1) {
			System.out.println("Value 5 not found");
		} else {
			System.out.println("Value 5 found at index "+ indx);
		}
		
		indx = sa.find(12); // not included in number 1..10
		
		if (indx == -1) {
			System.out.println("Value 12 not found");
		} else {
			System.out.println("Value 12 found at index "+ indx);
		}
	}

}
