public class DrawingBook {
    static int pageCount(int n, int p) {
        return (p<=n/2)? p/2 : n/2-p/2 ;

    }
    public static void main(String[] args) {
        System.out.println(pageCount(5,4));
        System.out.println(pageCount(6,2));
        System.out.println(pageCount(11,11));
        System.out.println(pageCount(1,1));
    }
}
