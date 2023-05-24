package collections;

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("asdf");
        list.add("2asdf");
        list.add("5asdf");

        ListIterator<String> stringListIterator = new ListIterator<>(list);
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next());
        }

    }
}
