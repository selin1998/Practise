import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {

      return (int)IntStream.range(0,s.size()-m+1).boxed().map(x->IntStream.range(0,m).mapToObj(y->{
              return  s.get(x+y);
        }).collect(Collectors.summingInt(Integer::intValue))).filter(i->i==d).count();
    }
    public static void main(String[] args) {

        System.out.println(birthday(Arrays.asList(1, 2 ,1, 3, 2),3,2));
        System.out.println(birthday(Arrays.asList(4),4,1));
    }
}
