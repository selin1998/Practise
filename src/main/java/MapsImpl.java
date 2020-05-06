import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class MapsImpl {


    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        map.put(103,"Rahul");


        for (Map.Entry integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey());
        }

        HashMap<String, Integer> rep = new HashMap<>();

        map.values().forEach(v->rep.merge(v,1,Integer::sum));
        System.out.println(rep);
        // Comparator.reverseOrder()
        Map<String, Integer> map1 = rep.entrySet().stream().sorted(comparingByKey()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,LinkedHashMap::new));
        System.out.println(map1);




    }
}
