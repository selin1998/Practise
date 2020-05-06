import java.util.Arrays;
import java.util.Comparator;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int totalPrice=-1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
               if(keyboard+drive<=b && keyboard+drive>totalPrice){
                   totalPrice=keyboard+drive;
               }
            }
        }
        return totalPrice;

    }

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3 ,1},new int[]{5, 2 ,8},10));
        System.out.println(getMoneySpent(new int[]{40,50,60},new int[]{5, 8,12},60));
    }
}
