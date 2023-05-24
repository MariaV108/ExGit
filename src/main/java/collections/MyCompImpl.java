package collections;

import java.util.Comparator;

public class MyCompImpl implements Comparator<Test1> {
    @Override
    public int compare(Test1 o1, Test1 o2) {
        return o2.n - o1.n;
    }
}
