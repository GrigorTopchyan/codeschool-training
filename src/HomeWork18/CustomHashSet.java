package HomeWork18;

import HomeWork17.HomeTask1.CustomCollection;
import HomeWork17.HomeTask1.CustomIterator;

public class CustomHashSet<E> implements CustomSet<E>  {
    private CustomHashMap<E,Object> hashMap;
    private  final Object VALUE=new Object();
    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return hashMap.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return hashMap.containsKey(o);
    }
    @Override
    public void clear() {
        hashMap.clear();
    }

    @Override
    public CustomIterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E e) {
        return hashMap.put(e,VALUE)==null;
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
    public boolean addAll(CustomCollection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(CustomCollection<?> c) {
        return false;
    }




}
