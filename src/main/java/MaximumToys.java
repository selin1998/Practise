import java.util.Arrays;

public class MaximumToys {

    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int counter=0;int sum=0;
        for (int i = 0; i < prices.length; i++) {
            sum+=prices[i];
            if(sum>=k) {
                return counter;
            }
            else counter++;
        }
        return 0;
    }

    static int maximumToys2(int[] prices, int k) {
        Arrays.sort(prices);
        int counter=0;

        while(k>0){
            k-=prices[counter++];
        }

        return counter-1;
    }
    public static void main(String[] args) {
        System.out.println(maximumToys2(new int[]{1, 12, 5, 111 ,200 ,1000 ,10},50));
        System.out.println(maximumToys2(new int[]{1, 3,4,2,5},7));
        System.out.println(maximumToys2(new int[]{3,7,2,9,4},15));
    }
}
