import java.util.Arrays;
import java.util.stream.IntStream;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int jumps = 1; int cloud = 0;
        while(cloud < c.length-3)
        {
            cloud += (c[cloud+2] == 0) ? 2 : 1;
            jumps++;
        }
        return jumps;
    }

    public static void main(String[] args) {

        System.out.println(jumpingOnClouds(new int[]{0, 0, 1 ,0 ,0 ,1 ,0}));
        System.out.println(jumpingOnClouds(new int[]{0 ,0 ,1 ,0,1}));

    }
}
