import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
      return  grades.stream().map(i->{
            int rem=i%5;
            return (rem>=3)&&(i>=38) ? i+5-rem : i;
        }).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(67,82,45,43,27,73,29,39)));
    }
}
