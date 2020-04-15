


public class StrongPassword {

    static boolean check(String password, String matching){
        return password.codePoints().mapToObj(i -> (char) i).anyMatch(x -> matching.indexOf(x) >= 0);

    }


    static int minimumNumber(int n, String password) {
        int counter = 0;
        String special_characters = "!@#$%^&*()-+";
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (check(password,special_characters)) counter++;
        if (check(password,numbers)) counter++;
        if (check(password,lower_case)) counter++;
        if (check(password,upper_case)) counter++;

        return 6-n>4-counter? 6-n:4-counter ;
    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(3,"Ab1"));
        System.out.println(minimumNumber(11,"#HackerRank"));
        System.out.println(minimumNumber(5,"#Rank"));
        System.out.println(minimumNumber(7,"#Rank11"));
        System.out.println(minimumNumber(4,"#@@1"));
    }
}
