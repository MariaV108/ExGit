package collections;

import java.util.Iterator;
import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private int index = 0;
    private List<T> source = null;

    public ListIterator(List<T> source) {
        this.source = source;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.source.size();
    }

    @Override
    public T next() {
        return this.source.get(this.index++);
    }
}
