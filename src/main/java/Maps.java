import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        TreeMap<Integer,String> names =new TreeMap<Integer, String>();
        names.put(3,"apple");
        names.put(4,"kiwi");
        names.put(1,"cherry");
        names.put(2,"banana");
        names.put(5,"orange");
        System.out.println(names);

        TreeMap<String,String> names2 =new TreeMap<String, String>();
        names2.put("al","apple");
        names2.put("af","kiwi");
        names2.put("ad","cherry");
        names2.put("yello","banana");
        names2.put("aa","orange");
        System.out.println(names2);


    }

}
