import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HourGlasses {

    static int hourglassSum(int[][] arr) {
        Integer max = IntStream.range(0, arr.length - 2).boxed().flatMap(i -> IntStream.range(0, arr[0].length - 2)
                .mapToObj(j -> hourGlass(arr, i, j))).max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }).get();


        return max;
    }

    static int hourGlass (int[][] arr,int row,int col) {
        int [][] a=new int[3][3];
        Integer sum = IntStream.range(0, 3).boxed().flatMap(i -> IntStream.range(0, 3).boxed()
                .map(j -> {
                            if(i==1 && (j==0 || j==2 )) return 0;
                            a[i][j] = arr[i + row][j + col];
                            return a[i][j];
                        }
                )).collect(Collectors.summingInt(Integer::intValue));
        return sum;
    }


    public static void main(String[] args) {
        int[][] a ={{-9, -9, -9, 1, 1, 1},
                    { 0, -9,  0, 4, 3, 2},
                    {-9, -9, -9, 1, 2, 3},
                    { 0,  0,  8, 6, 6, 0},
                    { 0,  0,  0, -2, 0, 0},
                    { 0,  0, 1,  2, 4, 0}
        };

        System.out.println(hourglassSum(a));


    }

}
