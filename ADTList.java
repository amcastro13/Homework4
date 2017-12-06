/**
 * 
 */
package adt.list;

/**
 * @author firer
 *
 */
public class ADTList<T> implements ADTListInterface<T> {
	

	private T[] listArray;
	private final static int DEFAULT_CAPACITY = 10;
	
	public ADTList() {
		this(DEFAULT_CAPACITY);
	}
	
	public ADTList(int initialCapacity) {
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new ADTList[initialCapacity];
		listArray = temp;
	}
	
	public static<T extends Comparable<? super T>> void insertionSort(){
		
	}

	@Override
	public void add(T newEntry) {
		// TODO Auto-generated method stub
		listArray[getLength()] = newEntry;
		
		
	}

	

	@Override
	public void add(T newEntry, int newPosition) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		
		if(newPosition - 1 >= getLength() - 1) {
			throw new IndexOutOfBoundsException("The item position does not exist");
		}
		
		if(listArray[newPosition - 1] != null) {
			replace(newPosition, newEntry);
		}
		else {
			listArray[newPosition - 1] = newEntry;
		}
	}

	/**public void outOfBoundsException(int itemPosition)  {
		try {
			remove(itemPosition);
		}
		catch(IndexOutOfBoundsException exe) {
			System.out.print(exe.getMessage());
		}
	}*/
	@Override
	/**
	 * Make sure to come back and fix this, probably has a problem
	 */
	public T remove(int itemPosition) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		T temp;
		if(isEmpty() || itemPosition - 1 > getLength() - 1) {
			throw new IndexOutOfBoundsException("The element does not exist");
		}
		else {
		temp = listArray[itemPosition - 1];
		listArray[itemPosition - 1] = null;
		for(int i = getLength() - 1; i <= itemPosition - 1; i++) {
			listArray[i + 1] = listArray[i];
		}
		}
		return temp;
	}

	

	@Override
	public T replace(int givenPosition, T newEntry) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(givenPosition < 1 || givenPosition - 1 > getLength() - 1) {
			throw new IndexOutOfBoundsException("The item position does not exist");
		}
		T temp;
		temp = listArray[givenPosition - 1];
		listArray[givenPosition - 1] = newEntry;
		
		return temp;
	}

	@Override
	public T getEntry(int givenPosition) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(givenPosition < 1 || givenPosition - 1 > getLength() - 1) {
			throw new IndexOutOfBoundsException("The item position does not exist");
		}
		else
		return listArray[givenPosition - 1];
	}

	/**
	 * Come back and figure out what this is.
	 */
	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return listArray;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		boolean doesContain = false;
		for(int i = 0; i <= getLength() - 1; i++) {
			if(listArray[i] == anEntry) {
				doesContain = true;
			}
		}
		return doesContain;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		int numOfEntries = 0;
		for(int i = 0; i <= listArray.length - 1; i++) {
			if(listArray[i] != null)
				numOfEntries++;
		}	
		return numOfEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(getLength() == 0)
			return true;
		else
			return false;
					
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= getLength() - 1; i++) {
			listArray[i] = null;
		}
		
	}

}
