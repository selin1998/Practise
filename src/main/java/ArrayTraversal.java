import java.util.stream.IntStream;

public class ArrayTraversal {

    public static void main(String[] args) {
        int[][]a = {

                {1,  2, 3, 4, },
                {5,  6, 7, 8, },
                {9, 10,11, 12,},
                {13,14,15, 16,},
                {17,18,19, 20,},
                {21,22,23, 24,},
                {25,26,27, 28,}};

        // 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
        IntStream.rangeClosed(0,6).boxed().flatMap(i->IntStream.rangeClosed(0,3).mapToObj(j->a[6-i][3-j])).forEach(x->System.out.printf("%d ",x));
        System.out.println();

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28
        IntStream.rangeClosed(0,6).boxed().flatMap(i->IntStream.rangeClosed(0,3).mapToObj(j->a[i][j])).forEach(x->System.out.printf("%d ",x));
        System.out.println();

        //1 5 9 13 17 21 25 2 6 10 14 18 22 26 3 7 11 15 19 23 27 4 8 12 16 20 24 28
        IntStream.rangeClosed(0,3).boxed().flatMap(i->IntStream.rangeClosed(0,6).mapToObj(j->a[j][i])).forEach(x->System.out.printf("%d ",x));
        System.out.println();

        // 28 24 20 16 12 8 4 27 23 19 15 11 7 3 26 22 18 14 10 6 2 25 21 17 13 9 5 1
        IntStream.rangeClosed(0,3).boxed().flatMap(i->IntStream.rangeClosed(0,6).mapToObj(j->a[6-j][3-i])).forEach(x->System.out.printf("%d ",x));
        System.out.println();
    }
}
