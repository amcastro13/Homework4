package adt.list;

/**
 * 
 * @author firer
 *
 *The ADTListInterface will provide an interface for the List data structure
 */

public interface ADTListInterface<T> {

	/**
	 * The method add will allow the user to add a newEntry onto the end of the list.
	 * @param newEntry, will become the newly added entry in the List.
	 * 
	 */
	public void add(T newEntry);
	
	/**
	 * This add method will add a new entry, T, into a specified position.
	 * @param T newEntry: The new item that will be added to the list.
	 * @param int newPosition: The specified position on the list.
	 */
	public void add(T newEntry, int newPosition) throws IndexOutOfBoundsException;
	
	/**
	 * The method remove will remove the item in the designated position. 
	 * Then all items underneath the removed item will be readjusted
	 * @param position: The position of the item on the list.
	 * @return T: returns the removed entry.
	 */
	public T remove(int position) throws IndexOutOfBoundsException;
	
	/**
	 * This method will replace the entry in the current position with a
	 * brand new entry into the list
	 * @param int givenPosition: The position of the entry in the list.
	 * 
	 */
	public T replace(int givenPosition,T newEntry) throws IndexOutOfBoundsException;
	
	/**
	 * The method getEntry will return a specified list entry
	 * @param int givenPosition: The position of the specified item
	 * @return T: the item in the given position
	 */
	public T getEntry(int givenPosition) throws IndexOutOfBoundsException;
	
	/**
	 * This method retrieves the entries of the list, in its current order.
	 */
	public T[] toArray();
	
	/**
	 * This method checks to see if an entry exists in this list. Will return true
	 * if the item exists, and false if it does not.
	 * @param T anEntry: The item being sought out
	 * @return boolean: true if it contains the entry, false if it does not.
	 */
	public boolean contains(T anEntry);
	
	/**
	 * This method will return the number of entries in the list
	 * @return int: the number of entries in the list.
	 */
	
	public int getLength();
	
	/**
	 * This method will check to see if the list is empty. The method
	 * will return true if empty, and false if it is not empty.
	 * @return boolean: boolean will return true if list is empty, false if 
	 * it is not empty.
	 */
	public boolean isEmpty();
	
	/**
	 * This method removes all entries in the list.
	 */
	public void clear();
}
