package HomeWork18;

import HomeWork17.HomeTask1.CustomCollection;
import HomeWork17.HomeTask1.CustomIterator;

public interface CustomSet<E>extends CustomCollection<E> {
    @Override
    int size();

    @Override
    boolean isEmpty();

    @Override
    boolean contains(Object o);

    @Override
    Object[] toArray();

    @Override
    boolean add(E e);

    @Override
    boolean remove(Object o);

    @Override
    boolean containsAll(CustomCollection<?> c);

    @Override
    boolean addAll(CustomCollection<? extends E> c);

    @Override
    boolean removeAll(CustomCollection<?> c);

    @Override
    void clear();

    @Override
    CustomIterator<E> iterator();
}
