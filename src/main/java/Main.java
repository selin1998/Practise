import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        List<Character> vowels= Arrays.asList('A','E','U','O','I','a','e','o','u','i');

        String str="HALLELUJAH";

        char[] chars = str.toCharArray();
        List<Integer> list=Arrays.asList(1,2,3,4,5);
        int[]a=new int[]{1,5,6,7,3};
        String collect = Arrays.stream(str.chars().toArray()).mapToObj(x -> (char) x).
                filter(y -> !vowels.contains(y)).map(z -> String.valueOf(z)).collect(Collectors.joining());
        System.out.println(collect);

        String collect1 = str.codePoints().mapToObj(x -> (char) x).filter(y -> !vowels.contains(y)).map(z -> String.valueOf(z)).collect(Collectors.joining());
        System.out.println(collect1);
        char[] chars1 = str.toCharArray();



    }
}
