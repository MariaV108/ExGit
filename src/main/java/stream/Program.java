package stream;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Sergei", 89));
        persons.add(new Person("Maria", 92));
        persons.add(new Person("Lala", 88));
        persons.add(new Person("Virineia", 102));
        persons.add(new Person("Irina", 81));

        double avAge = persons.stream().
                filter(p -> p.getAge() >= 90).
                mapToInt(p -> p.getAge()).
                average().getAsDouble();

        persons.stream().
                filter(p -> p.getAge() >= 90).
                sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).
                map(p -> p.getName()).
                forEach(System.out::println);

    }
}
