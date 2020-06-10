import java.util.Arrays;

public class InsertionSort2 {

    public static String format(int [] arr){
        return Arrays.toString(arr).replace(",","").replace("["," ").replace("]","").trim();
    }

    public static void insertionSort2(int n, int [] arr){

        for (int i = 1; i < n; i++) {
            int curr=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
               j--;
            }
            arr[j+1]=curr;
            System.out.println(format(arr));
        }


    }

    public static void main(String[] args) {
        insertionSort2(5, new int[]{6,7,5,4,9});
        insertionSort2(6, new int[]{1, 4, 3 ,5, 6 ,2});
    }
}
