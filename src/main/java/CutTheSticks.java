import java.util.Arrays;
import java.util.stream.IntStream;

public class CutTheSticks {

    static int findMin(int[]arr){
        // finds min among non-zero elements
      return  Arrays.stream(arr).filter(i->i!=0).min().orElseThrow(RuntimeException::new);
    }

    static long countNonzero(int[]arr){
       return Arrays.stream(arr).boxed().filter(i->i!=0).count();

    }
    
    static int[] cutTheSticks(int[] arr) {
        // number of cuts is equal to distinct elements in array
        int distinct=(int)Arrays.stream(arr).boxed().distinct().count();
        int[] result=new int[distinct];

        IntStream.range(0,result.length).boxed().forEach(i->{
            result[i]=(int)countNonzero(arr);
            int min=findMin(arr);
            IntStream.range(0,arr.length).boxed().forEach(a->{
                if(arr[a]!=0) arr[a]-=min;
            });
        });

       return  result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutTheSticks(new int[]{5, 4 ,4, 2 ,2 ,8})));
        System.out.println(Arrays.toString(cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2 ,1})));
    }
}
