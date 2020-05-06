import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Staircase {
    static void staircase(int n) {

        String s = IntStream.range(0, 6).boxed().map(row ->
                IntStream.range(0, 6).mapToObj(col ->
                        col < 6-row-1 ? " " : "#")
                        .collect(Collectors.joining()))
                .collect(Collectors.joining("\n"));
        System.out.println(s);

    }

    public static void main(String[] args) {


    }

}
