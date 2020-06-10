
public class RepeatedString {

    static long findOccurence(String s){
        return s.codePoints().filter(i -> i == 'a').count();
    }

    static long repeatedString(String s, long n) {
        long div=n/s.length();
        long rem=n%s.length();
        long count1 = findOccurence(s);
        long count2=findOccurence(s.substring(0,(int)rem));
        return div*count1 + count2;

    }

    public static void main(String[] args) {
        System.out.println(repeatedString("aba",10));
        System.out.println(repeatedString("a",1000000000000L));
    }
}
