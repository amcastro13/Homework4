package lab.one.cs.cs240;

public class MergeSortRecursive<T> {

	private final static int maxSize = 10;
	
	
	public static<T extends Comparable<? super T>> void mergeSort(T[] array, T[] tempArray, int first, int last) {
		
		int midPoint;
		//T[] tempArray = (T[])new Comparable<?>[array.length];
		
		last = array.length;
		if(first < last) {
			midPoint = last / 2;
			for(int i = 0; i < midPoint; i++) {
				array[i] = array[i];				
			}
			
			for(int j = 0; j < midPoint; j++) {
				tempArray[j] = array[midPoint + j];
			}
			
			mergeSort(array, tempArray, first, last);
			mergeSort(tempArray, tempArray, midPoint + 1, last);
			mergeArray(array, tempArray, first, midPoint, last);
			
		}
	}
	
	public static<T extends Comparable<? super T>>void mergeArray(T[] array, T[] tempArray, int first, int midPoint, int last) {
		
		int firstHalf1 = first;
		int backHalf1 = midPoint;
		int firstHalf2 = midPoint + 1;
		int backHalf2 = last;
		int index = 0;
		
		while((firstHalf1 <= backHalf1) && (firstHalf2 <= backHalf2)) {
			
			if(array[firstHalf1].compareTo(array[firstHalf2]) > 0) {
				tempArray[index] = array[firstHalf1];
				firstHalf1++;
			}
			else {
				tempArray[index] = array[firstHalf2];
				firstHalf2++;
			}
			index++;
		}
		
	}
}
