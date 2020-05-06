import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {

        Integer sum = bill.stream().filter(i->i!=bill.get(k)).collect(Collectors.summingInt(Integer::intValue));
        if(sum/2<b) System.out.println(b-sum/2);
        else System.out.println("Bon Appetit");
    }

    public static void main(String[] args) {
            bonAppetit(Arrays.asList(3, 10, 2 ,9),1,12);
    }
}
