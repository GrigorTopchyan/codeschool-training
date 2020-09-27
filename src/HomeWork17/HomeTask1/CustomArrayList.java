package HomeWork17.HomeTask1;


import HomeWork15.HomeTask2.ColloectionIsFullException;
import org.omg.CORBA.Object;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private T[] arr;
    private  int size;

    public CustomArrayList() {
    }

    public CustomArrayList(int size) {
        this.size = size;
        this.arr = (T[]) new Object[size];
    }



    @Override
    public T get(int index) throws CustomIndexOutOfBoundsException {
        if (size < index|index<0) {
            throw new CustomIndexOutOfBoundsException("CustomIndexOutOfBoundsException");
        }
        return arr[index];
    }

    @Override
    public T set(int index, T element) throws CustomIndexOutOfBoundsException {

        if (size < index|index<0) {
            throw new CustomIndexOutOfBoundsException("CustomIndexOutOfBoundsException");
        }else {T elementReturn =arr[index];
        arr[index] = element;
            return elementReturn;}

    }

    @Override
    public void add(int index, T element) throws CustomIndexOutOfBoundsException {
        if (index<0||size<index){
            throw new CustomIndexOutOfBoundsException("CustomIndexOutOfBoundsException");
    }
        T[] newArr = (T[]) new java.lang.Object[size + 1];
        for (int i = 0; i < size; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = element;
        arr = newArr;
        size++;
    }


    @Override
    public T remove(int index) throws CustomIndexOutOfBoundsException {
        if (index<0||size<index){
            throw new CustomIndexOutOfBoundsException("CustomIndexOutOfBoundsException");
        }
        T[] newArr = (T[]) new java.lang.Object[size - 1];
        T removedElement = arr[index];
        for (int i = 0; i < size - 1; i++) {
            if (i == index) {
                arr[i] = arr[i + 1];
            }
        } size--;
        return removedElement;
    }

    @Override
    public int indexOf(java.lang.Object o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(java.lang.Object o) {
        for (int i = size-1; i >-1 ; i--) {
            if (arr[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(java.lang.Object o) {
        return indexOf(o) != -1;
    }


    @Override
    public Object[] toArray() {
        return (Object[]) Arrays.copyOf(arr,arr.length);
    }

    @Override
    public boolean add(T t) {
        T[] newArr = (T[]) new java.lang.Object[size + 1];
        System.arraycopy(arr,0,newArr,1,arr.length);
        newArr[size++] = t;
        size++;
        arr = newArr;
        return true;
    }

    @Override
    public boolean remove(java.lang.Object o) {

        for (int i = 0; i < size -1; i++) {
            if (arr[i].equals(o)) {
                arr[i] = arr[i + 1];
                size--;
                return true;
            }
        }
        return false;
    }


    @Override
    public boolean containsAll(CustomCollection<?> c) {
        for (java.lang.Object el:c.toArray()) {
            if(!contains(el)){
                return false;
            }

        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection<? extends T> c) {
        boolean change = false;
        for (java.lang.Object el:c.toArray()) {
            change= add((T)el);
        }
        return change;
    }

    @Override
    public boolean removeAll(CustomCollection<?> c) {
        boolean change = false;
        for (java.lang.Object el:c.toArray()) {
            change= remove((T)el);
        }
        return change;
    }

    @Override
    public void clear() {
      size =0;
    }

    @Override
    public CustomIterator<T> iterator() {
        return new CustomArrayListIterator<>(this);
    }
    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
