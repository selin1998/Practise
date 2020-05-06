import java.util.Arrays;

public class SubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest ;
        String largest ;

        java.util.List<String> substrings = java.util.stream.IntStream.range(0,s.length()-k+1 ).mapToObj(i -> s.substring(i, i + k)).sorted().collect(java.util.stream.Collectors.toList());
        smallest=substrings.get(0);
        largest=substrings.get(s.length()-k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static String getSmallestAndLargest2(String s, int k) {
        String smallest="" ;
        String largest="" ;
        String[] substrings=new String[s.length()-k+1];

        for (int i = 0; i < s.length()-k+1; i++) {
            substrings[i]=s.substring(i,i+k);
        }
        Arrays.sort(substrings);
        System.out.println(Arrays.toString(substrings));
        smallest=substrings[0];
        largest=substrings[s.length()-k];



        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest2("welcometojava",3));
    }
}
