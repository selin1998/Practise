import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Strings {


    public static String generateRandomString(){

      return  new Random().ints(97,122).mapToObj(x->(char)x).
              limit((int)(Math.random()*20+10)).map(y->String.valueOf(y)).collect(Collectors.joining());
        
    }
    
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        System.out.println(generateRandomString());

        IntStream.range(0,30).forEach(x->strings.add(generateRandomString()));
        System.out.println(strings.toString());

        System.out.println(strings.stream().sorted().findFirst().get()+ " length ->"+ strings.stream().sorted().findFirst().get().length());
        System.out.println(strings.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        }).findFirst().get());


        String str="hallelujah";

        str.codePoints().mapToObj(x->(char)x).sorted(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.charValue()-o2.charValue();
            }
        }).forEach(System.out::println);


        String collect = str.codePoints().mapToObj(x -> (char) x).sorted(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.charValue() - o2.charValue();
            }
        }).map(z -> String.valueOf(z)).collect(Collectors.joining());

        System.out.println(collect);

        LinkedHashSet<Character> l=new LinkedHashSet<>();

        str.codePoints().mapToObj(i->(char)i).forEach(x->l.add(x));
        System.out.println(l.stream().map(x -> String.valueOf(x)).collect(Collectors.joining()));



    }


}
