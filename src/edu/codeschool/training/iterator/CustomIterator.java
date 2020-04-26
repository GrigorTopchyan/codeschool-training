package edu.codeschool.training.iterator;

/**
 *
 *
 * @param <E>
 */

public interface CustomIterator <E> {
    /**





     */
    boolean hasNext();

    /**

     */

    E next() throws CustomNoSuchElementException;

    /**


    */

    void remove() throws CustomIllegalStateException;

    /**



     */

}
