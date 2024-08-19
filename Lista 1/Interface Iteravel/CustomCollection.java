package Interface Iteravel;

import java.util.Iterator;

class CustomCollection<T> implements Iterable<T> {
    private T[] items;
    private int size = 0;

    public CustomCollection(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public void add(T item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return items[currentIndex++];
            }
        };
    }
}
