package edu.codeschool.training.iterator;

import java.util.List;

/**
 *
 *
 * @param <T>
 */

public interface CustomList <T> extends CustomCollection<T> {
    /**
     *
     *
     * @param index
     * @return
     */
    T get(int index) throws CustomIndexOutOfBoundsException;

    /**
     *
     *
     * @param args
     */

    T set(int index,T element) throws CustomIndexOutOfBoundsException;

    /**
     *
     *
     * @param args
     */

    void add(int index,T element) throws CustomIndexOutOfBoundsException;

    /**
     *
     *
     * @param args
     */

    T remove(int index);

    /**
     *
     *
     * @param args
     */

    int indexOf(Object o);

    /**
     *
     *
     * @param args
     */

    int lastIndex(Object o);

    /**
     *
     *
     * @param args
     */



}
