package edu.codeschool.training.iterator;

public class CustomArrayList <T> implements CustomList <T>  {
    public static void main(String[] args) throws CustomIndexOutOfBoundsException {
        CustomArrayList<Integer> arrayList = new CustomArrayList<>(3);
        arrayList.set(1,9);
        System.out.println(arrayList.get(1));
    }

    private transient Object [] elementDate;
    private int size;

    public CustomArrayList(int size) {
        this.elementDate = new Object[size];

    }
    private class Itr implements CustomIterator<T> {
        int first;
        int last = -1;

        Itr (){};

        @Override
        public boolean hasNext() {
            return size != 0;
        }

        @Override
        public T next() throws CustomNoSuchElementException {
            int i = first;
            if (i > size){
               throw new CustomNoSuchElementException("Has no more elements");
            }
            Object [] array = CustomArrayList.this.elementDate;
            first = first + 1;
            return (T) array[last = i];
        }

        @Override
        public void remove() throws CustomIllegalStateException {


        }
    }

    @Override
    public T get(int index) throws CustomIndexOutOfBoundsException {
        if(index< elementDate.length){
            return (T) elementDate[index];

        }
        throw new CustomIndexOutOfBoundsException("");
    }

    @Override
    public T set(int index, T element) throws CustomIndexOutOfBoundsException {
        if (index< elementDate.length){
            return (T) (elementDate[index] = element);
        }
        throw new CustomIndexOutOfBoundsException("");
    }




    @Override
    public void add(int index, T element) throws CustomIndexOutOfBoundsException {
        if (index> elementDate.length || elementDate.length < 0){
            throw new CustomIndexOutOfBoundsException("");
        }
        System.arraycopy(elementDate,index, elementDate,index + 1,size - index);
        elementDate[index] = element;
        size++;

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null){
            for (int i = 0; i <size ; i++) {
                if (elementDate[i] == null);
                return  i;
            }
        }else {
            for (int i = 0; i <size ; i++) {
                if (o.equals(elementDate[i])){
                    return i;
                }
            }
        }return -1;
    }

    @Override
    public int lastIndex(Object o) {
        if (o == null){
            for (int i = size - 1; i >= 0 ; i--) {
                if (elementDate[i] == null){
                    return i;
                }
            }
        }else {
            for (int i = size - 1; i >= 0 ; i--) {
                if (o.equals(elementDate[i])){
                    return i;
                }
            }
        }return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(0) >= 0 ;
    }

    @Override
    public Object[] toArray() {
        
    }

    @Override
    public boolean add(T e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(CustomCollection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(CustomCollection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(CustomCollection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public CustomIterator<T> iterator() {
        return new Itr();
    }



}
