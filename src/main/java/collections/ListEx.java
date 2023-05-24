package collections;

import java.util.*;
import java.util.stream.Stream;

public class ListEx {
    public static void main(String[] args) {

        List<Car> list = new ArrayList<>();

        list.add(new Car("Volvo V40", "XYZ 201845", 5));
        list.add(new Car("Citroen C1", "ABC 164521", 4));
        list.add(new Car("Dodge Ram", "KLM 845990", 2));

        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.brand.compareTo(car2.brand);
            }
        };
        Collections.sort(list, carComparator);

        Comparator<Car> carComparator1 = (car1, car2) -> car1.brand.compareTo(car2.brand);
        Comparator<Car> carComparator2 = (car1, car2) -> car1.numberPlate.compareTo(car2.numberPlate);
        Comparator<Car> carComparator3 = (car1, car2) -> car1.noOfDoors - car2.noOfDoors;

        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "a", "b", "c", "d", "m");
        Iterator<String> iterator = list3.iterator();
        while (iterator.hasNext()) {
            String n = iterator.next();
        }
        Stream<String> stream = list3.stream();
        stream.forEach(el -> {
            System.out.println(el);
        });
//
//        int firstIndex = list.indexOf("a");
//        Set<String> set1 = new HashSet<>();
//        set1.addAll(list);
//        Object[] o = list.toArray();
//        String[] s = list.toArray(new String[0]);
//        List<String> list1 = Arrays.asList(s);
    }
}

class Car {
    public String brand;
    public String numberPlate;
    public int noOfDoors;

    public Car(String brand, String numberPlate, int noOfDoors) {
        this.brand = brand;
        this.numberPlate = numberPlate;
        this.noOfDoors = noOfDoors;
    }
}
