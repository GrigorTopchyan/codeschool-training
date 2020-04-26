package edu.codeschool.training.iterator;

import java.util.Collection;

/**
 *
 *
 * @param <T>
 */


public interface CustomCollection <T> extends CustomIterable<T> {
    /**
     *
     *
     * @return
     */


    int size();

    /**
     *
     *
     * @param args
     */

    boolean isEmpty();

    /**
     *
     *
     *
     * @param args
     */

    boolean contains(Object o);

    /**
     *
     *
     *
     * @param args
     */

    Object [] toArray();

    /**
     *
     *
     *
     * @param args
     */

    boolean add(T e);

    /**
     *
     *
     * @param args
     */

    boolean remove(Object o);

    /**
     *
     *
     * @param args
     */

    boolean containsAll(CustomCollection <?> c);

    /**
     *
     *
     *
     * @param args
     */

    boolean addAll(CustomCollection <? extends T> c);

    /**
     *
     *
     * @param args
     */

    boolean removeAll(CustomCollection <?> c);

    /**
     *
     *
     * @param args
     */
    void clear();

    /**
     *
     *
     * @param args
     */


}
