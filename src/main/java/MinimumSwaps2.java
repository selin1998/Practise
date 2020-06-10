public class MinimumSwaps2 {



    static int minimumSwaps(int[] data) {
        int count=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    count++;
                    int t = data[i];
                    data[i] = data[j];
                    data[j] = t;
                }
            }
        }
        return count;

    }


    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{7, 1, 3, 2, 4, 5, 6}));
    }
}
