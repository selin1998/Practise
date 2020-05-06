import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ClimbingTheLeaderBoard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] sortedScores = Arrays.stream(scores).distinct().boxed().sorted((o1, o2) -> o2 - o1).mapToInt(i -> i).toArray();
        int result[]=new int[alice.length];
        for (int i = 0; i < alice.length; i++) {

            for (int j = 0; j < sortedScores.length; j++) {
                if(alice[i]>=sortedScores[j]) {
                    result[i]=j+1;
                    break;
                }

            }
            if(result[i]==0) result[i]=sortedScores.length+1;
        }
        return result;
    }



    public static void main(String[] args) {
        int integers[]=climbingLeaderboard(new int[]{100, 90, 90, 80, 75, 60}, new int[]{50, 65, 77, 90, 102});
        System.out.println(Arrays.toString(integers));
        int integers2[]=climbingLeaderboard(new int[]{100, 100 ,50, 40, 40 ,20, 10}, new int[]{5, 25, 50, 120});
        System.out.println(Arrays.toString(integers2));
    }
}
