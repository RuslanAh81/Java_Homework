import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Task2 {
    public static void main(String[] args) {
       String data = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова," +
               " Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова," +
               " Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
       LinkedList<String> parseData = parseNames(data);
        //System.out.println(parseData);
       //  frequency(parseData);
        TreeMap<String, Integer> countMap = getCount(parseData);
        System.out.println(countMap);
        System.out.println(getSortedValue(countMap));

    }
    static LinkedList<String> parseNames(String data){
        LinkedList<String> list = new LinkedList<>();
        String [] dataArr = data.split(", ");

        //System.out.println(Arrays.toString(dataArr));
        for (String people: dataArr) {
            list.add(people.split(" ")[0]);
        }
        return list;
    }
    static void  frequency(LinkedList<String>list) {
        Map<String, Long> frec = list.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));

        frec.forEach((k, v) -> System.out.println(k+ ":" + v));

    }

    static TreeMap<String, Integer> getCount(LinkedList<String> data) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (String name: data) {
            if(map.containsKey(name)) {
                map.put(name, map.get(name)+1);

            }else map.put(name, 1);
        }
        return map;
    }

    static TreeMap<String, Integer> getSortedValue(TreeMap<String, Integer>unsortedMap) {
        CountComparator sv = new CountComparator(unsortedMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(sv) {

        };
        sortedMap.putAll(unsortedMap);
        return sortedMap;
    }
}
