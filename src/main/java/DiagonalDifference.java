import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int downwardDiagonalSum=IntStream.range(0,arr.size()).map(x->arr.get(x).get(x)).sum();

        int upwardDiagonalSum=IntStream.range(0,arr.size()).map(x->arr.get(x).get(arr.size()-x-1)).sum();

        return Math.abs( downwardDiagonalSum- upwardDiagonalSum );

    }

    public static int diagonalDifference2(List<List<Integer>> arr) {

        return Math.abs(IntStream.range(0,arr.size()).map(x->arr.get(x).get(x) - arr.get(x).get(arr.size()-x-1)).sum());


    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> l1= Arrays.asList(11,2,3);
        List<Integer> l2= Arrays.asList(3,-7,1);
        List<Integer> l3= Arrays.asList(12,7,8);
        list.add(l1);
        list.add(l2);
        list.add(l3);

        System.out.println(diagonalDifference(list));
        System.out.println(diagonalDifference2(list));

    }

}
