import java.util.ArrayList;
import java.util.Arrays;

public class Collections {


    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.addAll(Arrays.asList(2,6,8,12,45));
        System.out.println(integers.subList(1,4).toString());

        System.out.println(integers.containsAll(Arrays.asList(6, 8)));
        integers.retainAll(Arrays.asList(2,8));
        System.out.println(integers.toString());


    }
}
