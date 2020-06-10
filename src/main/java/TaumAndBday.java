public class TaumAndBday {

    public static long taumBday(long b, long w, long bc, long wc, long z) {
        return (wc<bc && wc+z<bc) ? (wc+z)*b+wc*w : (bc<wc && bc+z<wc) ? (bc+z)*w+bc*b : bc*b+wc*w;
    }

    public static void main(String[] args) {
        System.out.println(taumBday(5,9,2,3,4));
        System.out.println(taumBday(3,6,9,1,1));
        System.out.println(taumBday(7,7,4,2,1));
    }
}
