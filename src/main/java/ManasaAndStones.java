import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManasaAndStones {

    static List<Integer> nextstones=new ArrayList<>();

    static List<Integer> recursion(List<Integer> stones,int a,int b, int n){

        if(n>1){
            nextstones = stones.stream().flatMap(s -> Stream.of(s + a, s + b)).collect(Collectors.toList());
            recursion(nextstones,a,b,n-1);
        }
        return nextstones;

    }

    static int[] stones(int n, int a, int b) {
        return   recursion(Arrays.asList(a,b),a,b,n-1).stream().distinct().mapToInt(i->i).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stones(4, 10, 100)));
        System.out.println(Arrays.toString(stones(3, 1, 2)));

    }
}
