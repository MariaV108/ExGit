package collections;

import java.util.*;

public class Test1 {
    int n;

    public static void main(String[] args) {
        TreeSet<String> list = new TreeSet<String>() {
        };
        list.add("1");
        list.add("2");
        list.add("3");

        MyCompImpl myComp = new MyCompImpl();
        SortedSet<String> l = new TreeSet(myComp);

        Iterator<String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
        }
    }
}
