

public class JavaAnagrams {


    static boolean isAnagram(String a, String b) {
       StringBuilder aa=new StringBuilder();
        StringBuilder bb=new StringBuilder();
        a.codePoints().mapToObj(i -> (char) i).map(x -> String.valueOf(x).toLowerCase()).sorted().forEach(z->aa.append(z));
        b.codePoints().mapToObj(i -> (char) i).map(x -> String.valueOf(x).toLowerCase()).sorted().forEach(z->bb.append(z));
        return aa.toString().equals(bb.toString());
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("hello","Hello"));
    }
}
