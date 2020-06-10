import java.util.Arrays;

public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] rotated=new int[a.length];
        int [] result=new int[queries.length];
        for (int i = 0; i <a.length ; i++) {
            rotated[i]=a[(a.length-k+i)%a.length];
        }
        final int[] count = {0};
        Arrays.stream(queries).forEach(i->{
            result[count[0]]=rotated[i];
            count[0]++;
        });
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(circularArrayRotation(new int[]{1, 2 ,3},2,new int[]{0,1,2})));
        System.out.println(Arrays.toString(circularArrayRotation(new int[]{1, 2 ,3,4,5},3,new int[]{0,1,2,4})));


    }
}
