package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableImplmEx implements Iterable {
    private List<ListIterator> list = new ArrayList<ListIterator>();

    @Override
    public Iterator iterator() {
        return this.list.iterator();
    }
}
