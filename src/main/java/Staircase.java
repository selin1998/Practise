import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Staircase {
    static void staircase(int n) {

        String s = IntStream.range(0, n).boxed().map(row ->
                IntStream.range(0, n).mapToObj(col ->
                        col > n-row-2 ? "#" : " ")
                        .collect(Collectors.joining()))
                .collect(Collectors.joining("\n"));
        System.out.println(s);

    }

    public static void main(String[] args) {
       staircase(5);

    }

}
