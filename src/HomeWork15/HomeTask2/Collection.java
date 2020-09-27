package HomeWork15.HomeTask2;

import org.omg.CORBA.Object;

import java.io.IOException;

public class Collection<T> {
    private T[] arr;
    private int size;

    public Collection(T[] arr, int size) {
        this.arr =  (T[]) new Object[size];
        this.size = size;
    }

    public void add(T element) throws ColloectionIsFullException {
        for (int i = 0; i < size; i++) {
            if (arr[i] == null) {
                arr[i] = element;
                return;
            }
        }
        throw new ColloectionIsFullException("ColloectionIsFullException ");
    }

    public T get(int index) {
        if (index < arr.length) {
            return  arr[index];
        }
        throw new IndexOutOfBoundsException("OutOfBoundsException");

    }

    public boolean isEmpty() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(T elem) {
        for (int i = 0; i < size; i++) {
            if(arr[i]==null){continue;}
            if (arr[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        int current=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                current++;
            }
        }
       return current;
    }
}
