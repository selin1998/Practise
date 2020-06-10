import java.util.Arrays;

public class HurdleRace {

    static int hurdleRace(int k, int[] height) {
        int potion = Arrays.stream(height).max().orElseThrow(RuntimeException::new) - k;
        return potion<0?0:potion;

    }


    public static void main(String[] args) {
        System.out.println(hurdleRace(4,new int[]{1 ,6 ,3 ,5 ,2}));
        System.out.println(hurdleRace(7,new int[]{2, 5 ,4 ,5 ,2}));
    }
}
