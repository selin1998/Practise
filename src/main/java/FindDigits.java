


public class FindDigits {

    static int findDigits(int n) {
        long count = String.valueOf(n).codePoints().map(i -> Integer.parseInt(String.valueOf((char) i))).filter(x -> x>0 && n % x == 0).count();
        return (int)count;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(12240));
    }
}
