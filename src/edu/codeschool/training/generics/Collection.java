package edu.codeschool.training.generics;

public class Collection<T> implements Comparable<T> {
    private int size;
    private T[] arr;

    public Collection(int size, T[] arr) {
        this.size = size;
        this.arr = arr;
    }

    public void add(T element) throws CollectionsFullException {
        for (int i = 0; i < size; i++) {
            if (arr[i] == null) {
                arr[i] = element;
                return;
            }
        }
        throw new CollectionsFullException("Collections are full");
    }

    public T get(int index) {
        for (int i = 0; i < arr.length; i++) {
            if (index < arr.length) {
                return arr[index];
            }
        }
        throw new IndexOutOfBoundsException();
    }// !!!!!

    public boolean isEmpty() {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(T element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].equals(element)) {
                return true;
            }
        }
        return false;
    }// !!!!!

    public int size() {
        int current = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                current++;
            }
        }
        return current;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
