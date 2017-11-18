package lab.one.cs.cs240;

public class QuickSort<T> {

	private static final int maxSize = 10;
	
	public static<T extends Comparable<? super T>> void quickSort(T[] array, int first, int last){
		
		if(first < last) {
			
			int pivotIndex = array.length;
			quickSort(array, first, pivotIndex - 1);
			quickSort(array, pivotIndex + 1, last);
			partition(array, first, pivotIndex);
		}
		
		
		
	}
	
	// Will partition the array into a small and big array
	//
public static< T extends Comparable<? super T>> int partition(T [] array, int low, int high) {
		
		
		int pivot = (high - 1)/2;	// pivot is equal to the index of the array/2
		T temp;
		int indexFromLeft = low - 1 ;// value that will keep track of the index from the left.
		int indexFromRight = high - 2; // value that will keep track of the index from the right
		temp = array[high - 1]; // temporary value will be transfered to the old array position of array[pivot]
		array[high - 1] = array[pivot];
		array[pivot] = temp;
		
		
		//Will run for every value in the array, use an if statement to check the values in the array
		for(int i = 0; i <= high - 2; i++ ) {

			
			
			if(array[indexFromLeft].compareTo(array[high - 1]) > 0 && array[indexFromRight].compareTo(array[high - 1]) < 0) {
				/**temp = array[i];
				array[i] = array[indexFromRight];
				array[indexFromRight] = temp;
				indexFromRight--;*/
				
				temp = array[indexFromLeft];
				array[indexFromLeft] = array[indexFromRight];
				array[indexFromRight] = temp;
			}
			
			if(array[high - 1].compareTo(array[indexFromLeft]) >= 0)
				indexFromLeft++;
			if(array[indexFromRight].compareTo(array[high - 1]) <= 0)
				indexFromRight--;
			
		}
		
		temp = array[high - 1];
		array[high - 1] = array[pivot];
		array[pivot] = temp;
		
		
		return pivot;
	}
}
