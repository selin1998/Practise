import java.util.ArrayList;

public class Pangram {
    static String pangrams(String s) {

        String str = s.replaceAll(" ", "").toLowerCase();
        long count = str.codePoints().mapToObj(i -> (char) i).distinct().count();
        System.out.println(count);
        return count == 26 ? "pangram" : "not pangram";

    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));

    }
}
