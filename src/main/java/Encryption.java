import java.util.ArrayList;
import java.util.List;

public class Encryption {

    static String encryption(String s) {
        List<String> strings=new ArrayList<String>();

        String trimmed = s.replace(" ", "");
        int len = trimmed.length();
        int ceil = (int) Math.ceil(Math.sqrt(len));
        int floor = (int) Math.floor(Math.sqrt(len));

        for (int i = 0; i <floor ; i++) {
            int upperbound=i*ceil+ceil;
            if(upperbound<len){
                strings.add(trimmed.substring(i*ceil,upperbound));
            }
            else strings.add(trimmed.substring(i*ceil,len));

        }
        System.out.println(strings);

        StringBuilder result=new StringBuilder();
        for (int i = 0; i < ceil; i++) {
            for (int j = 0; j < floor; j++) {
                result.append(strings.get(j).charAt(i));
            }
            result.append(" ");
        }

    return result.toString();

    }
    public static void main(String[] args) {

    }
}
