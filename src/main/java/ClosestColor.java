import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestColor {

//    List<Integer> black= Arrays.asList(0,0,0);
//    List<Integer> white= Arrays.asList(255,255,255);
//    List<Integer> red= Arrays.asList(255,0,0);
//    List<Integer> green= Arrays.asList(0,255,0);
//    List<Integer> blue= Arrays.asList(0,0,255);

    public static int binaryToInteger(String binary){
        int result = 0;
        for (int i = binary.length()-1; i >= 0 ; i--) {
            char ch = binary.charAt(i); // '0' or '1' 48 or 49
            int digit = ch - '0';       // 0 or 1
            int delta = digit << (binary.length() -i -1);
            result += delta;
        }
        return result;
    }

    public static String distance(int red, int green, int blue){
      final  double black=Math.sqrt(Math.pow(0-red,2)+Math.pow(0-green,2)+Math.pow(0-blue,2));
        double white=Math.sqrt(Math.pow(255-red,2)+Math.pow(255-green,2)+Math.pow(255-blue,2));
        double red1=Math.sqrt(Math.pow(255-red,2)+Math.pow(0-green,2)+Math.pow(0-blue,2));
        double green1=Math.sqrt(Math.pow(0-red,2)+Math.pow(255-green,2)+Math.pow(0-blue,2));
        double blue1=Math.sqrt(Math.pow(0-red,2)+Math.pow(0-green,2)+Math.pow(255-blue,2));
        List<Double> list=Arrays.asList(black,white,red1,green1,blue1);
        double asDouble = list.stream().mapToDouble(i -> i).min().getAsDouble();
        long count = list.stream().filter(i -> i == asDouble).count();
        if(count==1) {
            if(asDouble==black) return "Black";
            if(asDouble==white) return "White";
            if(asDouble==red1) return "Red";
            if(asDouble==green1) return "Green";
            if(asDouble==blue1) return "Blue";
        }
        return "Ambiguous";
    }

    public static List<String> closestColor(List<String> pixels) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < pixels.size(); i++) {
            int red=binaryToInteger(pixels.get(i).substring(0,8));
            int green=binaryToInteger(pixels.get(i).substring(8,16));
            int blue=binaryToInteger(pixels.get(i).substring(16,24));
            String answer=distance(red,green,blue);
            strings.add(answer);

        }
        return strings;

    }

    public static void main(String[] args) {
        System.out.println(closestColor(Arrays.asList("101111010110011011100100","110000010101011111101111","000000001111111111111111")));
    }
}
