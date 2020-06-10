import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingSort2 {

    static int[] countingSort(int[] arr) {
        int [] occurence=new int[100];
        int [] sortedArray=new int[arr.length];
        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        for (int i = 0; i < occurence.length; i++) {
            if(collect.get(i)!=null) occurence[i]=collect.get(i).intValue();
        }
        int counter=0;
        for (int i = 0; i < occurence.length; i++) {
            if(occurence[i]!=0){
                for (int j = 0; j < occurence[i]; j++) {
                    sortedArray[counter]=i;
                    counter++;
                }
            }
        }
        return sortedArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countingSort(new int[]{1, 4, 7, 8, 45, 7, 7, 9, 1, 4, 7, 23, 45, 23, 15, 89, 56, 45})));

    }
}
