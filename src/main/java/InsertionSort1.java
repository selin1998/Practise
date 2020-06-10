import java.util.Arrays;

public class InsertionSort1 {


    public static String format(int [] arr){
        return Arrays.toString(arr).replace(",","").replace("["," ").replace("]","").trim();
    }

    static void insertionSort1(int n, int[] arr) {
        int a=arr[n-1];
        for (int i = n-2; i >= 0; i--) {

            if(arr[i]>a){
                arr[i+1]=arr[i];
                System.out.println(format(arr));
            }
            else if(arr[i]<=a){
                arr[i+1]=a;
                System.out.println(format(arr));
                break;
            }
            if(i==0) {
                arr[i]=a;
                System.out.println(format(arr));
            }

        }



    }

    public static void main(String[] args) {
        insertionSort1(5,new int[]{2,4,6,8,3});
        System.out.println();
        insertionSort1(5,new int[]{1,2,4,5,3});
        System.out.println();
        insertionSort1(5,new int[]{2,3,4,5,1});
    }
}
