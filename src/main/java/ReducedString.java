import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReducedString {


    static String superReducedString2(String s) {
        StringBuilder str=new StringBuilder(s);
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1)==str.charAt(i)){
                str.deleteCharAt(i-1);
                str.deleteCharAt(i-1);
                i=0;
            }

        }
        return str.length()==0?"Empty String":str.toString();
    }

    public static void main(String[] args) {

        System.out.println(superReducedString2("aaabccddd"));
        System.out.println(superReducedString2("aab"));
        System.out.println(superReducedString2("aa"));
        System.out.println(superReducedString2("abcda"));
        System.out.println(superReducedString2("aabbccdd"));
        System.out.println(superReducedString2("abbccdda"));
        System.out.println(superReducedString2("abbeccedda"));
        System.out.println(superReducedString2("mwkommokwmxjivkkvijxshscbbcshsgwdyqqydwgzpnlzzlnpzvfeaiiaefvyeqjccjqeymhqhiihqhmhaomkkmoahhddymmyddh"));
       //empty
        System.out.println(superReducedString2("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));
        // tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh



    }
}
