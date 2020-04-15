


public class ShiftedString {

    public static String shift(String orig,  int toRight,int toLeft) {
        int len = orig.length();
        String o1 = orig.substring(toRight % len);
        String con1 = o1.concat(orig.substring(0, toRight % len));
        String o2 = con1.substring(toLeft % len);
        String con2 = o2.concat(con1.substring(0, toLeft % len));
        return con2;
    }

    public static void main(String[] args) {
        System.out.println(shift("abcde", 2, 1));

    }
}
