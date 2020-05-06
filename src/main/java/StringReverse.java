public class StringReverse {

    public static void main(String[] args) {
        String s="madam";
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        if(s.equals(str.toString())){
            System.out.print("Yes");
        }
        else System.out.print("No");

    }
}
