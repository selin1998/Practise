import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaximizeTheFinalElement {

    public static int getHeight(List<Integer> arr) {
        List<Integer> collect = arr.stream().sorted().collect(Collectors.toList());
       collect.set(0,1);
        for (int i = 1; i < collect.size(); i++) {
            if((collect.get(i)-collect.get(i-1))>1) collect.set(i,collect.get(i-1)+1);
        }
        System.out.println(collect);
        return collect.get(arr.size()-1);
    }
    public static void main(String[] args) {
        System.out.println(getHeight(Arrays.asList(3,1,2,2,5)));
    }
}
