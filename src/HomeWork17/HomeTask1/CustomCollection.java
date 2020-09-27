package HomeWork17.HomeTask1;

/**
 *
 *
 * @param <E>
 */

public interface CustomCollection<E> extends CustomIterable<E> {
    /**returns the number of elements in this collection*/
    int size();
    /**returns true if collection has no elements*/
    boolean isEmpty();
    /** returns true if this collection contains the given element*/
    boolean contains(Object o);
    /** returns the array containing all of the elements in this collection.
     * The returned array will be "safe" in that no references to it are maintained by this collection.
     * 	                        (In other words, this method must allocate a new array even if this collection is backed by an array).
     *                             The caller is thus free to modify the returned array.*/
    Object [] toArray();
    /**
     * Ensures that this collection contains the specified element (optional
     * operation).  Returns <tt>true</tt> if this collection changed as a
     * result of the call.  (Returns <tt>false</tt> if this collection does
     * not permit duplicates and already contains the specified element.)
     * @throws ClassCastException if the class of the specified element prevents it from being added to this collection
     */
    boolean add(E e);
    /**
     * Removes a single instance of the given element from this collection, if it is present.
     * Returns true if the element removed from the collection
     * @throws ClassCastException if the type of the specified element is incompatible with this collection
     */
    boolean remove(Object o);
    /**
     * Returns <tt>true</tt> if this collection contains all of the elements in the specified collection
     * @throws ClassCastException if the types of one or more elements in the specified collection are incompatible with this collection
     */
    boolean containsAll(CustomCollection<?> c);
    /**
     * Adds all of the elements in the specified collection to this collection
     */
    boolean addAll(CustomCollection<? extends E> c);
    /**
     * Removes all of this collection's elements that are also contained in the specified collection
     */
    boolean removeAll(CustomCollection<?> c);
    /**
     * Removes all of the elements from this collection.
     * The collection will be empty after this method returns.
     */
    void clear();


}
