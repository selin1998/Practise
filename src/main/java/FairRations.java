import java.util.Arrays;

public class FairRations {


    static String fairRations(int[] B) {
        int count=0;

        // if sum is odd no way
        if(Arrays.stream(B).sum()%2==1) return "NO";

        else {
            int sum=0;
            for (int i = 0; i < B.length; i++) {
                sum+=B[i];
                if(sum%2==1) count+=2;
            }

        }
        return String.valueOf(count);
    }

    public static void main(String[] args) {
        System.out.println(fairRations(new int[]{1, 2, 3, 4}));
        System.out.println(fairRations(new int[]{1, 2, 3, 4,5}));
        System.out.println(fairRations(new int[]{2,3,4,5,6}));
    }
}
