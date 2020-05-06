import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] str;
        str=s.trim().split("[^a-zA-Z]+");

        if(s.trim().isEmpty()){
            System.out.println("0");
            return;
        }
        else if(s.length() > 400000){
            return;
        }
        else{
            System.out.println(str.length);
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
            }
        }

        scan.close();
    }
}
