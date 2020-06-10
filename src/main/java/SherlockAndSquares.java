public class SherlockAndSquares {

    static int squares(int a, int b) {
        int start=(int)Math.sqrt(a);
        int end=(int)Math.sqrt(b);
        return (start*start>=a)?end-start+1:end-start;

    }
    public static void main(String[] args) {
        System.out.println(squares(35, 70));
        System.out.println(squares(100, 1000));
    }
}
