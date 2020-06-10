import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ACM {

    static List<Integer> ones(String s){
        List<Integer> ones=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1') ones.add(i);
        }
     //  return  IntStream.range(0,s.length()).boxed().filter(x->s.charAt(x)==).collect(Collectors.toList());
        return ones;

    }
    static int[] acmTeam(String[] topic) {
        int max= Integer.MIN_VALUE;
        List<Integer> topicsKnown = new ArrayList<>();
     //   IntStream.range(0,topic.length).boxed().flatMap(s->topic[s])
        for (int i = 0; i < topic.length; i++) {
            for (int j = 0; j < topic.length; j++) {
                if(i!=j){
                    List<Integer> ones = ones(topic[i]);
                    ones.addAll( ones(topic[j]));
                    ones=ones.stream().distinct().collect(Collectors.toList());
                    if(ones.size()>max) max=ones.size();
                    topicsKnown.add(ones.size());
                }
            }
        }
        final int a=max;
        long count = topicsKnown.stream().filter(i -> i == a).count();
        return new int[]{max,(int)count};
    }

    public static void main(String[] args) {
      //  System.out.println(ones("10101"));

    }

}
