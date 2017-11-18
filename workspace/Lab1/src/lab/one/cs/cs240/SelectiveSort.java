package lab.one.cs.cs240;

public class SelectiveSort<T>{ //<T extends Comparable<? super T>> {

	//private T[] numbers;
	private final static int maxSize = 10;
	

	
	public static<T extends Comparable<? super T>> void selectionSortIterative(T[] array, int max) {
		
		int smallIndex;
		max = maxSize;
		
		for(int small = 0; small < maxSize - 1; small++) {
			
			smallIndex = getSmallIndex(array, small, max - 1);
			swap(array, smallIndex, max);
			
		}
		
		
	}
	

	
	public static <T extends Comparable<? super T>> int getSmallIndex(T[] array, int first, int last) {
		
		int indexOfSmall = first;
		T min = array[first];
		for(int index = first + 1; index <= last; index++ ) {
			
			if(array[index].compareTo(min) < 0) {
				min = array[index];
				indexOfSmall = index;
				
			}
	
		}
		
		
		
		return indexOfSmall;
		
		
	}
	
	
	public static <T extends Comparable<? super T>> void swap(Object[] array, int elementA, int elementB) {
		
		Object temp = array[elementA];
		array[elementA] = array[elementB];
		array[elementB] = temp;
	}
}
