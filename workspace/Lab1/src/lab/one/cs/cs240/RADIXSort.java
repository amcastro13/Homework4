package lab.one.cs.cs240;

public class RADIXSort<T> {

	private static final int maxSize = 10;
	
	public static<T extends Comparable<? super T>> void RADIX(T[] array, int first, int last, int maxDigits) {
	
		T[] bucket = null;
		for(int i = 0; i <= maxDigits - 1; i++) {
			
			clear(bucket[i]);
			
		}
		
	}

	public static<T extends Comparable< ? super T>> void clear(T item) {
		// TODO Auto-generated method stub
		
	}
}
