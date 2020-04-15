


public class TwoStrings {


    static String twoStrings(String s1, String s2) {
        long count = s1.codePoints().map(i -> (char) i).distinct().filter(x -> s2.indexOf(x) >=0).count();
        System.out.println(count);
        return count==0?"NO":"YES";

    }

    public static void main(String[] args) {


        System.out.println(twoStrings("hello","world"));
        System.out.println(twoStrings("a","art"));
        System.out.println(twoStrings("cat","be"));

    }
}
