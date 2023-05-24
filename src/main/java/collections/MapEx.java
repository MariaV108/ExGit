package collections;

import java.util.*;
import java.util.stream.Stream;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> mapA = new HashMap<>();
        mapA.put("sd", "wq");
        mapA.put("s2d", "wq");
        mapA.put("w", "sfq");

        // итерация ключей
        Iterator<String> s = mapA.keySet().iterator();
        while (s.hasNext()) {
            String key = s.next();
            String value = mapA.get(key);
        }

        for (String key : mapA.keySet()) {
            String value = mapA.get(key);
        }

        Stream<String> stream = mapA.keySet().stream();
        stream.forEach((value) -> {
            System.out.println(value);
        });

        //итерация значений, так можно перебирать сами значения
        Iterator<String> v = mapA.values().iterator();
        while (v.hasNext()) {
            String key = v.next();
        }

        for (String value : mapA.values()) {
            System.out.println(value);
        }

        Stream<String> stream1 = mapA.values().stream();
        stream1.forEach((value) -> {
            System.out.println(value);
        });

        Set<Map.Entry<String, String>> entries = mapA.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
        }

        for (Map.Entry<String, String> entry : mapA.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
        }

        String d = "sdfasrtw";
        mapA.compute("s2d", (k, vg) -> (vg == null) ? d : vg.concat(d));
        mapA.computeIfAbsent("12",(j) -> "kgk");
        mapA.computeIfPresent("sd", (k, vg) -> vg == null ? null : vg.toUpperCase());

        String m = "rf";

       Comparator comparator1 = new Comparator() {
           @Override
           public int compare(Object o1, Object o2) {
               return o2.toString().compareTo(o1.toString());
           }
       };

       SortedMap sm = new TreeMap(comparator1);
    }
}
