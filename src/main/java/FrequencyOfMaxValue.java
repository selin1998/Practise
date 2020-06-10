import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfMaxValue {

    public static List<Integer> frequencyOfMaxValue(List<Integer> numbers, List<Integer> q) {
        ArrayList<Integer> integers = new ArrayList<>();
        int size=numbers.size();


        for (int i = 0; i < q.size(); i++) {

            List<Integer> sublist = numbers.subList(q.get(i)-1,size);
            System.out.println(sublist);
            int max = Collections.max(sublist);
            int occur= Collections.frequency(sublist,max);
            integers.add(occur);
        }
        return integers;

    }
    public static void main(String[] args) {
        System.out.println(frequencyOfMaxValue(Arrays.asList(5, 4, 5, 3, 2), Arrays.asList(1, 2, 3, 4, 5)));


    }
}
