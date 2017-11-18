package lab.one.cs.cs240;

// a class that will iteratively sort an array of values in ascending order
public class InsertionSortIterative<T> {

	 private static final int maxSize = 10; // value of the size of the array
	 
	 public static<T extends Comparable<? super T>> void insertionSort(T[] array, int first, int last){
		 
		 for(int unsorted = 0; unsorted < maxSize - 1; unsorted++) {
			 
			T nextValue = array[unsorted];
			 organizeNextValue(array, nextValue, first, unsorted - 1 );
			 
			 
		 }
		 
	
	 }
	 
	 public static<T extends Comparable<? super T>> void organizeNextValue(T[] array, T nextItem, int first, int last){
		 
		 int index = maxSize - 1;
		 
		 while((index >= first) && (array[index].compareTo(nextItem) > 0)) {
			 
			 array[index + 1] = array[index];
			 index--;
			 
		 }
		 array[index + 1] = nextItem;
		 
	 }
	 
}
