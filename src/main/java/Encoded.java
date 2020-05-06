import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Encoded {
    public static String decode(String encoded) {
        List<Integer> letters=new ArrayList();
        StringBuilder str=new StringBuilder(encoded);
        str.reverse();
        for (int i = 0; i < str.length()-2; i=i+2) {
            int a=Integer.parseInt(str.substring(i,i+2));
            if(a==32|| (a>=65 && a<=90)|| (a>=97 && a<=122) ) letters.add(a);
            else{
                int b=Integer.parseInt(str.substring(i,i+3));
                letters.add(b);
                i++;
            }
        }

        String decoder = letters.stream().mapToInt(i -> i).mapToObj(x -> (char) x).map(y -> String.valueOf(y)).collect(Collectors.joining());
        return decoder;
    }
    public static void main(String[] args) {
        System.out.println(decode("23511011501782351112179911801562340161171141148"));
        System.out.println(decode("2312179862310199501872379231018117927"));
    }
}
