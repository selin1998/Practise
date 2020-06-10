import java.util.stream.IntStream;

public class BeautifulDaysAtMovies {


    static int beautifulDays(int i, int j, int k) {
        int[] count={0};
        IntStream.rangeClosed(i,j).boxed().forEach(x->{
            if((x-Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString()))%k==0) count[0]++;
        });
        return  count[0];
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
        System.out.println(beautifulDays(13, 45, 3));
    }
}
