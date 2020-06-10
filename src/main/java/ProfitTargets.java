import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Collections;
public class ProfitTargets {

    public static int stockPairs(List<Integer> stocksProfit, long target) {
        int count=0;
       List<Integer> collect = stocksProfit.stream().distinct().filter(i -> i <= target).sorted().collect(Collectors.toList());

        for (int i = 0; i < collect.size(); i++) {
            if(collect.contains((int)target-collect.get(i))  ) {
                count++;

            }


        }
        if(target%2==0){
            if(Collections.frequency(stocksProfit,(int)(target/2))>1) {
               count++;
            }

        }

//

        return count/2;
    }
    public static void main(String[] args) {
        System.out.println(stockPairs(Arrays.asList(5, 7, 9, 13, 11, 6, 6, 3, 3), 12));
        System.out.println(stockPairs(Arrays.asList(6,12,3,9,3,5,1,12), 12));
        System.out.println(stockPairs(Arrays.asList(1,3,46,1,3,9), 47));
        System.out.println(stockPairs(Arrays.asList(6,6,3,9,3,5,1,12), 12));
    }
}
