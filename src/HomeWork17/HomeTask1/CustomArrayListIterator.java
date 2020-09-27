package HomeWork17.HomeTask1;

public class CustomArrayListIterator<T> implements CustomIterator<T> {
    private CustomArrayList<T> arrayList;
    private int cursor = 0;
    private T next = null;

    public CustomArrayListIterator(CustomArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        return cursor < arrayList.size();
    }

    @Override
    public T next() throws CustomIndexOutOfBoundsException {
        try {
            next = arrayList.get(cursor++);
            return next;

        } catch (CustomIndexOutOfBoundsException e) {
            throw new CustomNoSuchElementException();
        }
    }

    @Override
    public void remove() throws CustomIllegalStateException {
        if (next == null) {
            throw new CustomIllegalStateException("");
        }
        arrayList.remove(next);
        next =null;
    }
}
