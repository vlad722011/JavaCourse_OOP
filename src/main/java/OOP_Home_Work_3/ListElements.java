package OOP_Home_Work_3;

import java.util.Iterator;

public class ListElements<T> implements Iterable<T> {

    private Elements<T> first;
    private Elements<T> last;
    private int size;

    public void addElement(T element) {
        Elements<T> newElement = new Elements<>(null, element, null);
        if (first == null) {
            first = newElement;
        } else {
            ((Elements<T>) newElement).previous = last;
            last.next = newElement;
        }
        last = newElement;
        size++;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            Elements<T> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }
            @Override
            public T next() {
                T element = (T) current.currentElement;
                current = current.next;
                return element;
            }
        };
    }

    private class Elements<T> {
        Elements<T> previous;
        T currentElement;
        Elements<T> next;

        public Elements(Elements<T> previous, T currentElement, Elements<T> next) {
            this.previous = previous;
            this.next = next;
            this.currentElement = currentElement;
        }
    }
}





