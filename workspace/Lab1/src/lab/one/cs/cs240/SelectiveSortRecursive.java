package lab.one.cs.cs240;

public class SelectiveSortRecursive<T> {

	private final static int maxSize = 10;
	
	public static<T extends Comparable<? super T>> void selectionSort(T[] array, int first, int last) {
		
		int indexOfSmallest = 0;
		first = 0;
		last = maxSize;
		T smallest = array[first];
		
		//Conditional statement that will begin the selection sort if first < last
		if(first < last) {
			// for loop that will get the location of the smallest object
			for(int index = first + 1; index <= maxSize; index++) {
				
				if(array[first].compareTo(smallest) < 0) {
					smallest = array[first];
					indexOfSmallest = index;
					T temp = array[first];
					array[first] = array[last];
					array[last] = temp;
					
					
				}
				selectionSort(array, first + 1, last);
			}
		}
		
	}
	
	
}
