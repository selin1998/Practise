public class NewYearChaos {

    static void minimumBribes(int[] q) {
        int bribes = 0;
        for (int i = 0; i < q.length; i++) {
            if (q[i] - (i + 1) > 2) {
                // if distance between initial place and current >2 not possible
                System.out.println("Too chaotic");
                return;
            }
                // check the elements one and two steps prior to current,
                // if greater they must have bribed
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i])
                    bribes++;
            }
        }
        System.out.println(bribes);

    }

    public static void main(String[] args) {
        minimumBribes(new int[]{2, 1, 5, 3, 4});
        minimumBribes(new int[]{2, 5, 1, 3, 4});
        minimumBribes(new int[]{1, 2, 5, 3, 4, 7, 8, 6});
        minimumBribes(new int[]{1, 2, 5, 3, 7, 8, 6, 4});
    }
}
