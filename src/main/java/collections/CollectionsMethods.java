package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsMethods {
    public static void main(String[] args) {
        //addAll()
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "m");

        //int binarySearch() - ищет нужный элемент, возвращает его индекс,
        // подходит только для сортированных в порядке возрастания коллекций
        Collections.sort(list);
        int index = Collections.binarySearch(list, "d");
        System.out.println(index);

        //copy()
        List<String> list1 = new ArrayList<>();
        Collections.copy(list1, list);

        // reverse()
        Collections.reverse(list1);

        //shuffle() - перемешивает элеметны коллекции
        Collections.shuffle(list1);

        //sort()
        Collections.sort(list1);

        // min() и max() - ноходят минимальный и максимальный элементы коллекции
        String m = Collections.min(list1);
        String max = Collections.max(list);

        //replaceAll() - заменяет все определенные элементы коллекции на другой (например, все "а" на "b")
        Collections.replaceAll(list, "a", "b");

        //unmodifiableSet() - создает немодифицируемый список из обычного
        Collections.unmodifiableList(list1);


    }
}