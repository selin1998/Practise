import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class SparseArrays {
    static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> frequency = new HashMap<>();
        int [] occurence=new int[queries.length];
        for (int i = 0; i < strings.length; i++) {
            int count=frequency.containsKey(strings[i])?frequency.get(strings[i]):0;
            frequency.put(strings[i],count+1);

        }
        for (int i = 0; i < queries.length; i++) {
            occurence[i]=frequency.get(queries[i]);
        }
        return occurence;

    }

    static int[] matchingStrings2(String[] strings, String[] queries) {
        int [] result=new int[queries.length];
        List<Integer> integers = Arrays.stream(queries).mapToLong(i -> Arrays.stream(strings).filter(s -> s.equals(i)).count()).boxed().map(z -> z.intValue()).collect(Collectors.toList());
        IntStream.range(0,integers.size()).map(i->
        {result[i]=integers.get(i);
        return result[i];
        }).toArray();
       return result;
    }

    public static void main(String[] args) {
        String[] queries={"abc","ade","bc","abde"};
        String[] strings={"ade","bc","aa","abde","abde","ade","ade","abc"};
        System.out.println(Arrays.toString(matchingStrings(strings,queries)));
        System.out.println(Arrays.toString(matchingStrings2(strings,queries)));
    }


}
