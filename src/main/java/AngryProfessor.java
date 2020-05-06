import java.util.Arrays;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {

       return (Arrays.stream(a).filter(i->i<=0).count()>=k)?"NO":"YES";
    }

    public static void main(String[] args) {
        System.out.println(angryProfessor(3,new int[]{-1 ,-3 ,4, 2}));
    }
}
