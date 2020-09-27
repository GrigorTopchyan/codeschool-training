package HomeWork17.HomeTask1;

public interface CustomList<E> extends CustomCollection<E> {
    /**
     * Returns the element at the specified position in this list.
     * @throws CustomIndexOutOfBoundsException if the index is out of range
     */
    E get(int index) throws CustomIndexOutOfBoundsException;
    /**
     * Replaces the element at the specified position in this list with the specified element
     * @throws CustomIndexOutOfBoundsException if the index is out of range
     */
    E set(int index, E element) throws CustomIndexOutOfBoundsException;
    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts to the right all subsequent right elements.
     */
    void add(int index, E element) throws CustomIndexOutOfBoundsException;
    /**
     * Removes the element at the specified position in this list
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     */
    E remove(int index) throws CustomIndexOutOfBoundsException;
    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    int indexOf(Object o);
    /**
     * Returns last index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     */
    int lastIndexOf(Object o);
}
