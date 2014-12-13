/**
 * A data structure supporting searching for integers 
 * @author user
 *
 */
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
	 * A linear search routine
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
		
		SearchArray sa = new SearchArray(10);
		
		sa.insert(77);
		sa.insert(31);
		sa.insert(56);
		sa.insert(23);
		sa.insert(14);
		sa.insert(5);
		sa.insert(99);
		
		sa.display();
		
		// find a value
		System.out.println();
		
		int indx = sa.find(5);
		
		if (indx == -1) {
			System.out.println("Value 5 not found");
		} else {
			System.out.println("Value 5 found at index "+ indx);
		}
		
		indx = sa.find(12); // not included in numbers
		
		if (indx == -1) {
			System.out.println("Value 12 not found");
		} else {
			System.out.println("Value 12 found at index "+ indx);
		}
	}

}
