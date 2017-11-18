package lab.one.cs.cs240;

public class InsertionSortRecursive<T> {

	private static final int maxSize = 10;
	
	public static<T extends Comparable<? super T>> void insertionSort(T[] array, int first, int last) {
		
		last = maxSize - 1;
		if(first < last) {
			
			insertionSort(array, first, last - 1);
			organizeNext(array[last], array, first, last - 1);
		}
		
		
	}
	
	public static<T extends Comparable<? super T>> void organizeNext(T nextValue, T[] array, int first, int last) {
		
		if(nextValue.compareTo(array[last]) >= 0) {
			array[last + 1] = nextValue;
			
		}
		else if(first < last) {
			array[last + 1] =  array[last];
			organizeNext(nextValue, array, first, last - 1);
			
		}
		else {
			array[last + 1] = array[last];
			array[last] = nextValue;
		}
	}
}