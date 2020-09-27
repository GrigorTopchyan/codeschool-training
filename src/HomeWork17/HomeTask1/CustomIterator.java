package HomeWork17.HomeTask1;

public interface CustomIterator<E> {
    boolean hasNext();

    /**
     * Returns true if the iteration has more elements.
     */
    E next() throws CustomIndexOutOfBoundsException;

    /**
     * returns the next element in teh iteration,
     * throws CustomNoSuchElementException if the iteration has no more elements
     **/
    void remove() throws CustomIllegalStateException;
    /**  removes from the underlying collection the last element returned by this iterator.
    This method can be called only one per call to next().
     throws CustomIllegalStateExveption if the next() method has not yet ben called, or the
     remove method has already been called after teh last call to the next() method**/
}


