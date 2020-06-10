public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s) {
        int awfulDinner=(m+s-1)%n;
        return awfulDinner!=0?awfulDinner:n;

    }

    public static void main(String[] args) {
        System.out.println(saveThePrisoner(7 ,19, 2));
        System.out.println(saveThePrisoner(3 ,7 ,3));
    }
}
