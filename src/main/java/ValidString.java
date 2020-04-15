import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidString {

    static String isValid(String s) {
        HashMap<Character,Integer> occur=new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(occur.get(c)!=null){
                occur.put(c,occur.get(c)+1);
            }
            else occur.put(c,1);
        }


        Map<Integer, Long> collect = occur.values().stream().collect(Collectors.groupingBy(i -> i,
                Collectors.counting()
        ));

        System.out.println(collect);
        System.out.println(collect.size());
        if(collect.size()==1 || collect.size()==0){
            return "YES";
        }
       else if(collect.size()==2 && Collections.max(collect.keySet())-Collections.min(collect.keySet())==1 && collect.values().contains((long)1)  ){
          return "YES";
        }
        else {
            return "NO";
        }

    }

    public static void main(String[] args) {


        String result = isValid("abcdefghhgfedecba");
        System.out.println(result);
        String result2 = isValid("aabbccddeefghi");
        System.out.println(result2);
        String result3 = isValid("aabbcd");
        System.out.println(result3);
        String result4 = isValid("abc");
        System.out.println(result4);
        String result5 = isValid("abcc");
        System.out.println(result5);
        String result6 = isValid("abccc");
        System.out.println(result6);
        String result7 = isValid("a");
        System.out.println(result7);
        String result8 = isValid("aaaabb");
        System.out.println(result8);
    }
}
